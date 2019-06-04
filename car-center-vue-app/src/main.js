import Vue from 'vue'
import App from './App.vue'
import { router } from './routes.js'
import VueResource from 'vue-resource';
import checkbox from 'vue-material-checkbox'
import { library } from '@fortawesome/fontawesome-svg-core'
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'
import { faUserSecret, faUser, faCar } from '@fortawesome/free-solid-svg-icons'
import { faUserCircle } from '@fortawesome/free-solid-svg-icons'
import axios from 'axios'
import VueAxios from 'vue-axios'

library.add(faUserCircle);
library.add(faUserSecret);
library.add(faUser);
library.add(faCar);

Vue.use(checkbox);
Vue.component('font-awesome-icon', FontAwesomeIcon)

new Vue({
  el: '#app',
  render: h => h(App),
  router
})

const token = localStorage.getItem('user-token')
if (token) {
  axios.defaults.headers.common['Authorization'] = token;
}