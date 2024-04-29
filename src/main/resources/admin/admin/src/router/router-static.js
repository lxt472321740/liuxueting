import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import chongwuxinxi from '@/views/modules/chongwuxinxi/list'
    import news from '@/views/modules/news/list'
    import aboutus from '@/views/modules/aboutus/list'
    import pingjiaxinxi from '@/views/modules/pingjiaxinxi/list'
    import fuwuxinxi from '@/views/modules/fuwuxinxi/list'
    import storeup from '@/views/modules/storeup/list'
    import fuwuleixing from '@/views/modules/fuwuleixing/list'
    import chongwuzhonglei from '@/views/modules/chongwuzhonglei/list'
    import fuwuxuanze from '@/views/modules/fuwuxuanze/list'
    import fuwujindu from '@/views/modules/fuwujindu/list'
    import systemintro from '@/views/modules/systemintro/list'
    import yonghu from '@/views/modules/yonghu/list'
    import binglixinxi from '@/views/modules/binglixinxi/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/chongwuxinxi',
        name: '宠物信息',
        component: chongwuxinxi
      }
      ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
      ,{
	path: '/aboutus',
        name: '关于我们',
        component: aboutus
      }
      ,{
	path: '/pingjiaxinxi',
        name: '评价信息',
        component: pingjiaxinxi
      }
      ,{
	path: '/fuwuxinxi',
        name: '服务信息',
        component: fuwuxinxi
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/fuwuleixing',
        name: '服务类型',
        component: fuwuleixing
      }
      ,{
	path: '/chongwuzhonglei',
        name: '宠物种类',
        component: chongwuzhonglei
      }
      ,{
	path: '/fuwuxuanze',
        name: '服务选择',
        component: fuwuxuanze
      }
      ,{
	path: '/fuwujindu',
        name: '服务进度',
        component: fuwujindu
      }
      ,{
	path: '/systemintro',
        name: '系统简介',
        component: systemintro
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/binglixinxi',
        name: '病例信息',
        component: binglixinxi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '系统首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
