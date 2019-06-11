<template>
    <div class="container">
        <div class="mainProfileContainer">
            <div class="profileContainer">
                <div class="awesomeContainer">
                    <font-awesome-icon class="awwUserC"  icon="user-circle"  size="2x"/>
                    <h2>Profile</h2>
                </div>
                <div class="awesomeContainerMini">
                    <font-awesome-icon class="awwUser"  icon="user"  size="2x"/>
                    <h3>User Data</h3>
                </div>
                <div class="awesomeContainerMini">
                    <font-awesome-icon class="awwUser"  icon="car"  size="2x"/>
                    <h3>History</h3>
                </div>
                
            </div>
            <div class="previewContainer">
                <button v-on:click="goTo">vehicles</button>
            </div>
        </div>
        <form-data></form-data>
    </div>  
</template>

<script>
import FormData from "../components/FormData.vue"
import { router } from '../routes';

export default {
    components: {
        "form-data" : FormData,
    },
    data() {
        return {
            user_data: {
                name: 'name',
                surname: 'surname',
                'phone number': '000-000-000',
                city: 'city',
                street: 'street',
                'flat number': '0FN',
                'zip code': '00-000',
            }
        }
    },
    methods: {
        goTo: function() {
            router.push('/vehicles');
        }
    }
    
}
</script>

<style scoped>
    html {
        
    }
    .container {
        width: 100vw;
        height: 100vh;
        background: url(../assets/con1.jpg) no-repeat center center fixed;
        -webkit-background-size: cover;
        -moz-background-size: cover;
        -o-background-size: cover;
        background-size: cover;
        display: flex;
        flex-direction: row;
        
    }
    .container .mainProfileContainer {
        width: 350px;
        height: 100vh;
        background: rgba(31, 31, 31, 0.856);
    }
    .container .profileContainer .awesomeContainer {
        display: flex;
        flex-direction: row;
        align-items: baseline;
        padding-left: 20px;
    }
    .container .profileContainer .awesomeContainerMini {
        display: flex;
        flex-direction: row;
        align-items: baseline;
        padding-left: 10px;
        margin: 10px 10px 0 10px;
    }    

    .container .profileContainer .awesomeContainerMini:hover {
        background: #ffffff96;
        border: 1px solid #ffffff96;
        border-radius: 5px;
        /* padding: 10px; */
    }

     .container .profileContainer .awesomeContainer .awwUserC {
         color: #ff1414f3;
     }
     .container .profileContainer .awesomeContainerMini .awwUser {
         color: #ffffff;
         
     }
    .container .profileContainer h2 {
        font-weight: 400;
        line-height: 1.3;
        letter-spacing: normal;
        margin: 0;
        color: #ff1414f3;
        font-size: 40px;
        padding: 20px 0 0px 20px;
    }
    .container .profileContainer h3 {
        font-weight: 400;
        line-height: 1.3;
        letter-spacing: normal;
        margin: 0;
        color: #ffffff;
        font-size: 20px;
        padding: 20px 0 10px 20px;
    }
    .container .profileContainer .awesomeContainer h2::after {
        content: "";
        border: 0.8px solid rgb(46, 46, 46);
        display: block;
        margin-top: 20px;
        /* margin-right: 20px; */
    }
    .container .profileContainer::after {
        content: "";
        border: 0.8px solid rgb(46, 46, 46);
        display: block;
        width: 80%;
        margin-left: 10%;
        margin-top: 20px;
    }
    .container .previewContainer button {
        margin: 20px 0 20px 10%;
        width: 80%;
        height: 45px;
        background-color: #ff1414cc;
        border: 1px solid #ff1414;
        color: #fff;
        font-size: 16px;
        border-radius: 5px;
    }

    .container .previewContainer button:hover {
        background-color: #ffffffb6;
        border: 1px solid #000102c0;
        color: #ff1414;
    }
</style>
