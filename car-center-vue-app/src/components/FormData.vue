<template>
    <div class="formData">
        <div class="formDataContainer">
            <h2>Edit Profile</h2>
            <div class="dataContainer">
                <div class="singleData" v-for="(value, property) in user">
                    <label>{{ property }}</label>
                    <input type="text" v-bind:value="value">
                </div>
            </div>
            <div class="dataContainer">
                <div class="singleData">
                    <label for="">name</label>
                    <input type="text" v-bind:value="user_data.name">
                </div>
                <div class="singleData">
                    <label for="">surname</label>
                    <input type="text" v-bind:value="user_data.surname">
                </div>
                <div class="singleData">
                    <label for="">phone</label>
                    <input type="text" v-bind:value="user_data['phone number']">
                </div>
            </div>
            <div class="dataContainer">
                <div class="singleData21">
                    <label for="">city</label>
                    <input type="text" v-bind:value="(user_data.city)">
                </div>
                <div class="singleData">
                    <label for="">zip code</label>
                    <input type="text" v-bind:value="user_data['zip code']">
                </div>
            </div>
            <div class="dataContainer">
                <div class="singleData21">
                    <label for="">street</label>
                    <input type="text" v-bind:value="user_data.street">
                </div>
                <div class="singleData">
                    <label for="">flat number</label>
                    <input type="text" v-bind:value="user_data['flat number']">
                </div>
            </div>
            <button>update profile</button>
        </div>
    </div>
</template>

<script>
export default {
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
            },
            user: {
                username: "username",
                email: "email@com"
            }
        }
    }
}
</script>

<style scoped>
.formData {
    width: 100%;
    background: rgba(255, 255, 255, 0.795);
    border: 1px solid rgba(255, 255, 255, 0.795);
    border-radius: 5px;
}
.formData .formDataContainer {
    display: flex;
    flex-direction: column;
    width: 50%;
    margin: 60px 0 0 50px;
}

.formData .formDataContainer h2 {
        font-weight: 300;
        line-height: 1.3;
        letter-spacing: normal;
        margin: 0;
        color: rgb(31, 31, 31);
        font-size: 50px;
        padding: 20px 0 0px 30px;
    }
.formData .formDataContainer .dataContainer {
    display: flex;
    flex-direction: row;
    margin: 15px 20px 15px 20px;
    /* justify-content: space-evenly; */
    
}
.formData .formDataContainer .dataContainer input {
    background: rgba(163, 163, 163, 0.877);
    border: 1px solid rgba(163, 163, 163, 0.877);
    border-radius: 5px;
    /* margin: 0px 30px 20px 30px; */
    height: 25px;
    color: rgb(31, 31, 31);
}
.formData .formDataContainer .dataContainer label {
    color: #ff1414f3;
    font-weight: 300;
    /* margin: 20px 30px 5px 30px; */
    font-size: 26px;
}
.formData .formDataContainer  button {
        margin: 30px 0 20px 71%;
        width: 26%;
        height: 45px;
        background-color: #ff1414cc;
        border: 1px solid #ff1414;
        color: #fff;
        font-size: 16px;
        border-radius: 5px;
}
.formData .formDataContainer  button:hover {
        background-color: #ffffffb6;
        border: 1px solid #000102c0;
        color: #ff1414;
}
.formData .formDataContainer .dataContainer .singleData, .singleData21 {
    display: flex;
    flex-direction: column;
    flex: 1 1;
    justify-content: space-between;
    margin-left: 10px;
}
.formData .formDataContainer .dataContainer .singleData21 {
    flex: 2 1 auto;
}
</style>
