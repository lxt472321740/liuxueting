(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-center-center"],{"27ae":function(e,n,t){"use strict";t.r(n);var i=t("55b4"),r=t.n(i);for(var a in i)"default"!==a&&function(e){t.d(n,e,(function(){return i[e]}))}(a);n["default"]=r.a},"53b9":function(e,n,t){"use strict";var i,r=function(){var e=this,n=e.$createElement,t=e._self._c||n;return t("v-uni-view",{staticClass:"content"},[t("v-uni-view",{style:{width:"100%",padding:"0 0 64rpx",position:"relative",background:"url(http://codegen.caihongy.cn/20221108/581bb1956ffe4c8182127ca1e196e95e.png) fixed",height:"100%"}},[t("v-uni-view",{staticClass:"header",class:{status:e.isH5Plus},style:{padding:"0 24rpx",boxShadow:"0px 4rpx 4rpx #ccc",margin:"0 0 24rpx 0",background:"url(http://codegen.caihongy.cn/20221109/53c3ca7135ec48488fc0683a2bf29ddf.jpg) no-repeat",display:"flex",width:"100%",backgroundSize:"100%",height:"280rpx"},on:{click:function(n){arguments[0]=n=e.$handleEvent(n),e.onPageTap("../user-info/user-info")}}},["yonghu"==e.tableName?t("v-uni-view",{staticClass:"userinfo",style:{width:"calc(100% - 112rpx)",alignItems:"center",display:"flex",height:"100%"}},[t("v-uni-image",{style:{width:"88rpx",padding:"0",margin:"0 20rpx 0 0",borderRadius:"100%",height:"88rpx"},attrs:{src:e.user.touxiang?e.baseUrl+e.user.touxiang:"/static/gen/upload.png"}}),t("v-uni-view",{staticClass:"info",style:{width:"100%",flex:"1",flexDirection:"column",justifyContent:"center",display:"flex",height:"100%"}},[t("v-uni-view",{style:{width:"100%",lineHeight:"36rpx",fontSize:"24rpx",color:"#333"}},[e._v(e._s(e.user.yonghuzhanghao)),e.user.vip&&"是"==e.user.vip?t("v-uni-text",[e._v("(VIP)")]):e._e()],1)],1)],1):e._e(),t("v-uni-view",{staticClass:"setting",style:{width:"112rpx",alignItems:"center",justifyContent:"center",display:"flex",height:"100%"}},[t("v-uni-view",{staticClass:"cuIcon-settings",style:{border:"0",width:"64rpx",lineHeight:"64rpx",fontSize:"64rpx",color:"#333",borderRadius:"0"}})],1)],1),t("v-uni-view",{staticClass:"list",style:{width:"100%",padding:"0 24rpx 160rpx",flexWrap:"wrap",background:"url(http://codegen.caihongy.cn/20221108/581bb1956ffe4c8182127ca1e196e95e.png) fixed",display:"flex",height:"auto"}},[e._l(e.menuList,(function(n){return[e._l(n.backMenu,(function(i,r){return e.role==n.roleName?[e._l(i.child,(function(n,i){return["yifahuodingdan"!=n.tableName&&"yituikuandingdan"!=n.tableName&&"yiquxiaodingdan"!=n.tableName&&"weizhifudingdan"!=n.tableName&&"yizhifudingdan"!=n.tableName&&"yiwanchengdingdan"!=n.tableName&&"exampaper"!=n.tableName&&"examquestion"!=n.tableName?t("v-uni-view",{key:i+"_0",staticClass:"li",style:{boxShadow:"0px 0.10rpx 2rpx #ccc",borderColor:"#ccc",margin:"0 0 16rpx",alignItems:"center",borderWidth:"0 0 2rpx",background:"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)",display:"flex",width:"100%",borderStyle:"solid",height:"auto"},attrs:{"hover-class":"hover"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onPageTap("../"+n.tableName+"/list?userid="+e.user.id+"&menuJump="+n.menuJump)}}},[t("v-uni-view",{class:n.appFrontIcon,style:{width:"64rpx",padding:"0 0 0 16rpx",lineHeight:"64rpx",fontSize:"64rpx",color:"#afade4"}}),t("v-uni-view",{staticClass:"text",style:{width:"100%",padding:"0 32rpx",lineHeight:"88rpx",fontSize:"28rpx",color:"#333",flex:"1"}},[e._v(e._s(n.menu))]),t("v-uni-view",{staticClass:"cuIcon-right",style:{width:"28rpx",padding:"0 48rpx 0 0",lineHeight:"28rpx",fontSize:"28rpx",color:"#999"}})],1):e._e()]}))]:e._e()}))]}))],2)],1)],1)},a=[];t.d(n,"b",(function(){return r})),t.d(n,"c",(function(){return a})),t.d(n,"a",(function(){return i}))},"55b4":function(e,n,t){"use strict";var i=t("4ea4");Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0,t("96cf");var r=i(t("3b8d")),a=i(t("2971")),c={data:function(){return{isH5Plus:!0,user:{},tableName:"",role:"",menuList:[],iconArr:["cuIcon-same","cuIcon-deliver","cuIcon-evaluate","cuIcon-shop","cuIcon-ticket","cuIcon-cascades","cuIcon-discover","cuIcon-question","cuIcon-pic","cuIcon-filter","cuIcon-footprint","cuIcon-pulldown","cuIcon-pullup","cuIcon-moreandroid","cuIcon-refund","cuIcon-qrcode","cuIcon-remind","cuIcon-profile","cuIcon-home","cuIcon-message","cuIcon-link","cuIcon-lock","cuIcon-unlock","cuIcon-vip","cuIcon-weibo","cuIcon-activity","cuIcon-friendadd","cuIcon-friendfamous","cuIcon-friend","cuIcon-goods","cuIcon-selection"]}},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var e=(0,r.default)(regeneratorRuntime.mark((function e(){var n,t,i;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return this.role=uni.getStorageSync("role"),n=uni.getStorageSync("nowTable"),e.next=4,this.$api.session(n);case 4:t=e.sent,this.user=t.data,this.tableName=n,i=a.default.list(),this.menuList=i;case 9:case"end":return e.stop()}}),e,this)})));function n(){return e.apply(this,arguments)}return n}(),onShow:function(){var e=(0,r.default)(regeneratorRuntime.mark((function e(){var n,t,i;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return uni.removeStorageSync("useridTag"),this.role=uni.getStorageSync("role"),n=uni.getStorageSync("nowTable"),e.next=5,this.$api.session(n);case 5:t=e.sent,this.user=t.data,this.tableName=n,i=a.default.list(),this.menuList=i;case 10:case"end":return e.stop()}}),e,this)})));function n(){return e.apply(this,arguments)}return n}(),methods:{onPageTap:function(e){uni.setStorageSync("useridTag",1),uni.navigateTo({url:e,fail:function(){uni.switchTab({url:e})}})}}};n.default=c},9278:function(e,n,t){var i=t("b987");"string"===typeof i&&(i=[[e.i,i,""]]),i.locals&&(e.exports=i.locals);var r=t("4f06").default;r("5043f088",i,!0,{sourceMap:!1,shadowMode:!1})},b987:function(e,n,t){var i=t("24fb");n=i(!1),n.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-730619d8]{height:calc(100vh - 94px);box-sizing:border-box}',""]),e.exports=n},d2c0:function(e,n,t){"use strict";t.r(n);var i=t("53b9"),r=t("27ae");for(var a in r)"default"!==a&&function(e){t.d(n,e,(function(){return r[e]}))}(a);t("f6c2");var c,o=t("f0c5"),u=Object(o["a"])(r["default"],i["b"],i["c"],!1,null,"730619d8",null,!1,i["a"],c);n["default"]=u.exports},f6c2:function(e,n,t){"use strict";var i=t("9278"),r=t.n(i);r.a}}]);