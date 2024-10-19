<script setup>
import http from "../util/http.js"
// import axios from "axios";
http.get("/list")
    .then(res => {
        console.log(res)
    })
    .catch(err => { console.log(err) })
</script>
<template>
    <h1>Hello, world!</h1>
    <h1>Hello, world!</h1>
    <h1>Hello, world!</h1>
    <h1>Hello, world!</h1>
</template>
<style scoped></style>