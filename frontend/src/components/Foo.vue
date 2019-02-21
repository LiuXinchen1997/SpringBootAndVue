<template>
  <div>
    <p v-bind:class="{changeColor:flag}">{{msg}}</p>
    请输入用户ID：<input type='text' v-model="id" @blur="onblur"/>
  </div>
</template>

<script>

export default {
  data () {
    return {
      id: '',
      msg: '',
      flag: false
    }
  },

  components: {},

  computed: {},

  mounted: function () {
    this.$axios.get('/api/user/get/1').then(res => {
      console.log(res.data)
    })
  },

  methods: {
    onblur: function () {
      this.$axios.get('/api/user/get/' + this.id).then(res => {
        if (res.data) {
          this.msg = '用户名：' + res.data.name + '，性别：' + res.data.gender
        } else {
          this.flag = true
          this.msg = '抱歉，您输入的用户不存在！'
        }
      },
      err => {
        console.log(err)
        this.flag = true
        this.msg = '请求错误！'
      })
    }
  }
}
</script>

<style scoped>
p {
  font-size: 20px;
}

.changeColor {
  color: red;
}
</style>
