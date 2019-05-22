package com.project.security.carcenterauthserver;

import jdk.nashorn.internal.parser.TokenStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

@Configuration
public class AuthServerConfig extends AuthorizationServerConfigurerAdapter {

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    TokenStore tokenStore;

    @Autowired
    AuthenticationManager authenticationManager;

    // who can validate a token
    // serwer zapewnia klientowi token, aplikacja klienta  używa tokenu do dostępu do serveru z zasobami
    // server z zasobami bierze token od klienta i wysyła zapytanie do serveru odpowiedzialnego za uwieżytelnienie,
    // czy token jest ważny
    // endpoint: /oauth/check_token
    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security.checkTokenAccess("isAuthenticated()");
    }

    // where we define the client information
    // w przyszłości zastąpić bazą
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("client")
                .secret(encoder.encode("secret"))
                .authorizedGrantTypes("password")
                .scopes("all")
        .and().withClient("resource-server")
        .secret(encoder.encode("secret"))
        .authorizedGrantTypes("password")
        .scopes("all");
    }

    // where we define authentication manager
    // how the server will store the tokens
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.tokenStore(tokenStore)
                .authenticationManager(authenticationManager);
    }

    // do 2 Override
    @Bean
    PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

    // do 3
    @Bean
    TokenStore tokenStore() {
        return new InMemoryTokenStore();
    }
}
