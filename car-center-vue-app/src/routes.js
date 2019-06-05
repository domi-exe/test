import Vue from 'vue'
import Router from 'vue-router'
import VueRouter from 'vue-router'
import SignIn from './components/SignIn.vue'
import SignUp from './components/SignUp.vue'
import Home from './components/Home.vue'
import About from './components/About.vue'
import Logged from './views/Logged.vue'
import Vehicles from './views/Vehicles.vue'
import Profile from './views/Profile.vue'


Vue.use(Router);

const ifNotAuthenticated = (to, from, next) => {
  if (localStorage.isAuthenticated === "false" || localStorage.isAuthenticated === undefined) {
    console.log(localStorage.isAuthenticated);
    next()
    return
  }
  console.log(next);
  next('/logged')
}

const ifAuthenticated = (to, from, next) => {
  if (localStorage.isAuthenticated === "true") {
    next()
    return
  }
  next('/signin')
}

export const router = new Router({
    mode:'history',
    routes: [
      {
        path: '/',
        name: 'home',
        component: Home,
        beforeEnter: ifNotAuthenticated
      },
      {
        path: '/logged',
        name: 'logged',
        component: Logged,
        beforeEnter: ifAuthenticated
      },
      {
        path: '/signin',
        name: 'login',
        component: SignIn,
        beforeEnter: ifNotAuthenticated
      },
      {
        path: '/signup',
        name: 'signup',
        component: SignUp,
        beforeEnter: ifNotAuthenticated
      },
      {
        path: '/about',
        name: 'about',
        component: About,
        beforeEnter: ifNotAuthenticated
      },
      {
        path: '/vehicles',
        name: 'vehicles',
        component: Vehicles,
        beforeEnter: ifAuthenticated
      },
      {
        path: '/profile',
        name: 'profile',
        component: Profile,
        beforeEnter: ifAuthenticated
      },
      {
          // other
          path: '*',
          redirect: '/'
      }
    ]
  });

 