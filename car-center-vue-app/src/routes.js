import Vue from 'vue'
import Router from 'vue-router'
import VueRouter from 'vue-router'
import SignIn from './components/SignIn.vue'
import SignUp from './components/SignUp.vue'
import Home from './components/Home.vue'
import About from './components/About.vue'
import Logged from './views/Logged.vue'
import Vehicles from './views/Vehicles.vue'


Vue.use(Router);

export const router = new Router({
    mode:'history',
    routes: [
      {
        path: '/home',
        name: 'home',
        component: Home
      },
      {
        path: '/',
        name: 'logged',
        component: Logged
      },
      {
        path: '/signin',
        name: 'login',
        component: SignIn
      },
      {
        path: '/signup',
        name: 'signup',
        component: SignUp
      },
      {
        path: '/about',
        name: 'about',
        component: About
      },
      {
        path: '/vehicles',
        name: 'vehicles',
        component: Vehicles
      },
      {
          // other
          path: '*',
          redirect: '/'
      }
    ]
  });

  router.beforeEach((to, from, next) => {
    // redirect to login page if not logged in and trying to access a restricted page
    const publicPages = ['/signin'];
    const authRequired = !publicPages.includes(to.path);
    const loggedIn = localStorage.getItem('user');
  
    if (authRequired && !loggedIn) {
    //   return next({ 
    //     path: '/signin', 
    //     query: { returnUrl: to.path } 
    //   });
    }
  
    next();
  })