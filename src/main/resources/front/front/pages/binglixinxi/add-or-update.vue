<template>
<view class="content">
	<view :style='{"width":"100%","padding":"0 0 64rpx","position":"relative","background":"url(http://codegen.caihongy.cn/20221108/581bb1956ffe4c8182127ca1e196e95e.png) fixed","height":"auto"}'>
		<form :style='{"width":"100%","padding":"24rpx","background":"none","display":"block","height":"auto"}' class="app-update-pv">
			<view :style='{"padding":"12rpx 0","boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">病例编号</view>
				<view :style='{"padding":"0px 24rpx","margin":"0px","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(0, 0, 0)","flex":"1"}' class="right-input">
					{{ruleForm.binglibianhao}}
				</view>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">病例名称</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"none","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.binglimingcheng" v-model="ruleForm.binglimingcheng" placeholder="病例名称"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="" @tap="fuwufengmianTap">
				<view :style='{"width":"auto","padding":"0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">服务封面</view>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-if="ruleForm.fuwufengmian" :src="baseUrl+ruleForm.fuwufengmian.split(',')[0]" mode="aspectFill"></image>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">用户账号</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"none","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.yonghuzhanghao" v-model="ruleForm.yonghuzhanghao" placeholder="用户账号"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">用户姓名</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"none","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.yonghuxingming" v-model="ruleForm.yonghuxingming" placeholder="用户姓名"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">联系方式</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"none","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.lianxifangshi" v-model="ruleForm.lianxifangshi" placeholder="联系方式"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">宠物昵称</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"none","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.chongwunicheng" v-model="ruleForm.chongwunicheng" placeholder="宠物昵称"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">宠物种类</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"none","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.chongwuzhonglei" v-model="ruleForm.chongwuzhonglei" placeholder="宠物种类"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">宠物性别</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"none","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.chongwuxingbie" v-model="ruleForm.chongwuxingbie" placeholder="宠物性别"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">宠物品种</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"none","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.chongwupinzhong" v-model="ruleForm.chongwupinzhong" placeholder="宠物品种"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">宠物毛色</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"none","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.chongwumaose" v-model="ruleForm.chongwumaose" placeholder="宠物毛色"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="" @tap="binglifujianTap">
				<view :style='{"width":"auto","padding":"0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">病例附件</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"none","fontSize":"28rpx","height":"80rpx"}' v-if="ruleForm.binglifujian"  v-model="baseUrl+ruleForm.binglifujian" placeholder="病例附件"></input>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"auto","padding":"0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">入院时间</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}' mode="date" :value="ruleForm.ruyuanshijian" @change="ruyuanshijianChange">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#998dde"}' class="uni-input">{{ruleForm.ruyuanshijian?ruleForm.ruyuanshijian:"请选择入院时间"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"auto","padding":"0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">出院时间</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}' mode="date" :value="ruleForm.chuyuanshijian" @change="chuyuanshijianChange">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#998dde"}' class="uni-input">{{ruleForm.chuyuanshijian?ruleForm.chuyuanshijian:"请选择出院时间"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"auto","padding":"0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">登记时间</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}' mode="date" :value="ruleForm.dengjishijian" @change="dengjishijianChange">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#998dde"}' class="uni-input">{{ruleForm.dengjishijian?ruleForm.dengjishijian:"请选择登记时间"}}</view>
				</picker>
			</view>
			
			<!-- 否 -->
 

			<view :style='{"padding":"12rpx 0","boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">症状</view>
				<textarea :style='{"border":"0","minHeight":"240rpx","padding":"24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx"}' v-model="ruleForm.zhengzhuang" placeholder="症状"></textarea>
			</view>
			
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#ccc","borderWidth":"0 0 0px 0","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"100%","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","fontWeight":"500"}' class="title">备注</view>
                <xia-editor ref="editor" :style='{"minHeight":"300rpx","border":"2rpx solid #ddd","padding":"24rpx","boxShadow":"0px 0.10rpx 2rpx #ccc","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","width":"100%","lineHeight":"1.5","height":"auto"}' v-model="ruleForm.beizhu" placeholder="备注" @editorChange="beizhuChange"></xia-editor>
			</view>
			
			<view :style='{"width":"100%","justifyContent":"space-between","display":"flex","height":"auto"}' class="btn" >
				<button :style='{"border":"0","padding":"0px","boxShadow":"0px 4rpx 12rpx #ccc","margin":"0","color":"rgb(255, 255, 255)","borderRadius":"16rpx","background":"radial-gradient(circle, rgba(216,214,246,1) 0%, rgba(204,189,235,1) 24%, rgba(181,191,232,1) 62%, rgba(175,173,228,1) 100%)","width":"48%","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

	</view>
</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";
    import xiaEditor from '@/components/xia-editor/xia-editor';
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
				cross:'',
				ruleForm: {
				binglibianhao: this.getUUID(),
				binglimingcheng: '',
				fuwufengmian: '',
				yonghuzhanghao: '',
				yonghuxingming: '',
				lianxifangshi: '',
				chongwunicheng: '',
				chongwuzhonglei: '',
				chongwuxingbie: '',
				chongwupinzhong: '',
				chongwumaose: '',
				binglifujian: '',
				zhengzhuang: '',
				ruyuanshijian: '',
				chuyuanshijian: '',
				dengjishijian: '',
				beizhu: '',
				},
				// 登录用户信息
				user: {},
                ro:{
                   binglibianhao : false,
                   binglimingcheng : false,
                   fuwufengmian : false,
                   yonghuzhanghao : false,
                   yonghuxingming : false,
                   lianxifangshi : false,
                   chongwunicheng : false,
                   chongwuzhonglei : false,
                   chongwuxingbie : false,
                   chongwupinzhong : false,
                   chongwumaose : false,
                   binglifujian : false,
                   zhengzhuang : false,
                   ruyuanshijian : false,
                   chuyuanshijian : false,
                   dengjishijian : false,
                   beizhu : false,
                },
			}
		},
		components: {
			wPicker,
            xiaEditor,
            multipleSelect
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},



		},
		async onLoad(options) {
            this.ruleForm.ruyuanshijian = this.$utils.getCurDate();
            this.ruleForm.chuyuanshijian = this.$utils.getCurDate();
            this.ruleForm.dengjishijian = this.$utils.getCurDate();
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取



			// 如果有登录，获取登录后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`binglixinxi`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='binglibianhao'){
					this.ruleForm.binglibianhao = obj[o];
					this.ro.binglibianhao = true;
					continue;
					}
					if(o=='binglimingcheng'){
					this.ruleForm.binglimingcheng = obj[o];
					this.ro.binglimingcheng = true;
					continue;
					}
					if(o=='fuwufengmian'){
					this.ruleForm.fuwufengmian = obj[o].split(",")[0];
					this.ro.fuwufengmian = true;
					continue;
					}
					if(o=='yonghuzhanghao'){
					this.ruleForm.yonghuzhanghao = obj[o];
					this.ro.yonghuzhanghao = true;
					continue;
					}
					if(o=='yonghuxingming'){
					this.ruleForm.yonghuxingming = obj[o];
					this.ro.yonghuxingming = true;
					continue;
					}
					if(o=='lianxifangshi'){
					this.ruleForm.lianxifangshi = obj[o];
					this.ro.lianxifangshi = true;
					continue;
					}
					if(o=='chongwunicheng'){
					this.ruleForm.chongwunicheng = obj[o];
					this.ro.chongwunicheng = true;
					continue;
					}
					if(o=='chongwuzhonglei'){
					this.ruleForm.chongwuzhonglei = obj[o];
					this.ro.chongwuzhonglei = true;
					continue;
					}
					if(o=='chongwuxingbie'){
					this.ruleForm.chongwuxingbie = obj[o];
					this.ro.chongwuxingbie = true;
					continue;
					}
					if(o=='chongwupinzhong'){
					this.ruleForm.chongwupinzhong = obj[o];
					this.ro.chongwupinzhong = true;
					continue;
					}
					if(o=='chongwumaose'){
					this.ruleForm.chongwumaose = obj[o];
					this.ro.chongwumaose = true;
					continue;
					}
					if(o=='binglifujian'){
					this.ruleForm.binglifujian = obj[o];
					this.ro.binglifujian = true;
					continue;
					}
					if(o=='zhengzhuang'){
					this.ruleForm.zhengzhuang = obj[o];
					this.ro.zhengzhuang = true;
					continue;
					}
					if(o=='ruyuanshijian'){
					this.ruleForm.ruyuanshijian = obj[o];
					this.ro.ruyuanshijian = true;
					continue;
					}
					if(o=='chuyuanshijian'){
					this.ruleForm.chuyuanshijian = obj[o];
					this.ro.chuyuanshijian = true;
					continue;
					}
					if(o=='dengjishijian'){
					this.ruleForm.dengjishijian = obj[o];
					this.ro.dengjishijian = true;
					continue;
					}
					if(o=='beizhu'){
					this.ruleForm.beizhu = obj[o];
					this.ro.beizhu = true;
					continue;
					}
				}
			}
			this.styleChange()
            this.$forceUpdate()
		},
		methods: {
            beizhuChange(e) {
                this.ruleForm.beizhu = e
            },
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv . .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},

			// 多级联动参数

			ruyuanshijianChange(e) {
				this.ruleForm.ruyuanshijian = e.target.value;
				this.$forceUpdate();
			},
			chuyuanshijianChange(e) {
				this.ruleForm.chuyuanshijian = e.target.value;
				this.$forceUpdate();
			},
			dengjishijianChange(e) {
				this.ruleForm.dengjishijian = e.target.value;
				this.$forceUpdate();
			},



			fuwufengmianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.fuwufengmian = 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},
			binglifujianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.binglifujian = 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},

			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {



































//跨表计算判断
				var obj;
				//更新跨表属性
			       var crossuserid;
			       var crossrefid;
			       var crossoptnum;
				if(this.cross){
					var statusColumnName = uni.getStorageSync('statusColumnName');
					var statusColumnValue = uni.getStorageSync('statusColumnValue');
					if(statusColumnName!='') {
                        if(!obj) {
						    obj = uni.getStorageSync('crossObj');
                        }
						if(!statusColumnName.startsWith("[")) {
							for (var o in obj){
								if(o==statusColumnName){
									obj[o] = statusColumnValue;
								}

							}
							var table = uni.getStorageSync('crossTable');
							await this.$api.update(`${table}`, obj);
						} else {
						       crossuserid=Number(uni.getStorageSync('userid'));
						       crossrefid=obj['id'];
						       crossoptnum=uni.getStorageSync('statusColumnName');
						       crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
						}
					}
				}
				if(crossrefid && crossuserid) {
					this.ruleForm.crossuserid=crossuserid;
					this.ruleForm.crossrefid=crossrefid;
					let params = {
						page: 1,
						limit:10,
						crossuserid:crossuserid,
						crossrefid:crossrefid,
					}
					let res = await this.$api.list(`binglixinxi`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
						return false;
					} else {
                //跨表计算
						if(this.ruleForm.id){
							await this.$api.update(`binglixinxi`, this.ruleForm);
						}else{
							await this.$api.add(`binglixinxi`, this.ruleForm);
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
                //跨表计算
					if(this.ruleForm.id){
						await this.$api.update(`binglixinxi`, this.ruleForm);
					}else{
						await this.$api.add(`binglixinxi`, this.ruleForm);
					}
					this.$utils.msgBack('提交成功');
				}
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
