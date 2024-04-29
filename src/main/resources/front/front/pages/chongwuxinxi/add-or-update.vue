<template>
<view class="content">
	<view :style='{"width":"100%","padding":"0 0 64rpx","position":"relative","background":"url(http://codegen.caihongy.cn/20221108/581bb1956ffe4c8182127ca1e196e95e.png) fixed","height":"auto"}'>
		<form :style='{"width":"100%","padding":"24rpx","background":"none","display":"block","height":"auto"}' class="app-update-pv">
			<view :style='{"padding":"12rpx 0","boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">宠物编号</view>
				<view :style='{"padding":"0px 24rpx","margin":"0px","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(0, 0, 0)","flex":"1"}' class="right-input">
					{{ruleForm.chongwubianhao}}
				</view>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">宠物昵称</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"none","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.chongwunicheng" v-model="ruleForm.chongwunicheng" placeholder="宠物昵称"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"auto","padding":"0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">宠物种类</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}' @change="chongwuzhongleiChange" :value="chongwuzhongleiIndex"  :range="chongwuzhongleiOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#998dde"}' class="uni-input">{{ruleForm.chongwuzhonglei?ruleForm.chongwuzhonglei:"请选择宠物种类"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="" @tap="chongwutupianTap">
				<view :style='{"width":"auto","padding":"0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">宠物图片</view>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-if="ruleForm.chongwutupian" :src="baseUrl+ruleForm.chongwutupian.split(',')[0]" mode="aspectFill"></image>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"auto","padding":"0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">宠物性别</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}' @change="chongwuxingbieChange" :value="chongwuxingbieIndex"  :range="chongwuxingbieOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#998dde"}' class="uni-input">{{ruleForm.chongwuxingbie?ruleForm.chongwuxingbie:"请选择宠物性别"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">宠物习性</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"none","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.chongwuxixing" v-model="ruleForm.chongwuxixing" placeholder="宠物习性"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">宠物品种</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"none","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.chongwupinzhong" v-model="ruleForm.chongwupinzhong" placeholder="宠物品种"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">宠物毛色</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"none","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.chongwumaose" v-model="ruleForm.chongwumaose" placeholder="宠物毛色"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">宠物年龄</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"none","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.chongwunianling" v-model="ruleForm.chongwunianling" placeholder="宠物年龄"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">宠物重量</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"none","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.chongwuzhongliang" v-model="ruleForm.chongwuzhongliang" placeholder="宠物重量"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"0px 0.10rpx 4rpx #ccc","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"auto","padding":"0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">先天疾病</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}' @change="xiantianjibingChange" :value="xiantianjibingIndex"  :range="xiantianjibingOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#998dde"}' class="uni-input">{{ruleForm.xiantianjibing?ruleForm.xiantianjibing:"请选择先天疾病"}}</view>
				</picker>
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
			
			<!-- 否 -->
 

			
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#ccc","borderWidth":"0 0 0px 0","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"100%","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","fontWeight":"500"}' class="title">宠物详情</view>
                <xia-editor ref="editor" :style='{"minHeight":"300rpx","border":"2rpx solid #ddd","padding":"24rpx","boxShadow":"0px 0.10rpx 2rpx #ccc","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","width":"100%","lineHeight":"1.5","height":"auto"}' v-model="ruleForm.chongwuxiangqing" placeholder="宠物详情" @editorChange="chongwuxiangqingChange"></xia-editor>
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
				chongwubianhao: this.getUUID(),
				chongwunicheng: '',
				chongwuzhonglei: '',
				chongwutupian: '',
				chongwuxingbie: '',
				chongwuxixing: '',
				chongwupinzhong: '',
				chongwumaose: '',
				chongwunianling: '',
				chongwuzhongliang: '',
				xiantianjibing: '',
				chongwuxiangqing: '',
				yonghuzhanghao: '',
				yonghuxingming: '',
				lianxifangshi: '',
				},
				chongwuzhongleiOptions: [],
				chongwuzhongleiIndex: 0,
				chongwuxingbieOptions: [],
				chongwuxingbieIndex: 0,
				xiantianjibingOptions: [],
				xiantianjibingIndex: 0,
				// 登录用户信息
				user: {},
                ro:{
                   chongwubianhao : false,
                   chongwunicheng : false,
                   chongwuzhonglei : false,
                   chongwutupian : false,
                   chongwuxingbie : false,
                   chongwuxixing : false,
                   chongwupinzhong : false,
                   chongwumaose : false,
                   chongwunianling : false,
                   chongwuzhongliang : false,
                   xiantianjibing : false,
                   chongwuxiangqing : false,
                   yonghuzhanghao : false,
                   yonghuxingming : false,
                   lianxifangshi : false,
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
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取
			this.ruleForm.yonghuzhanghao = this.user.yonghuzhanghao
			this.ro.yonghuzhanghao = true;
			this.ruleForm.yonghuxingming = this.user.yonghuxingming
			this.ro.yonghuxingming = true;
			this.ruleForm.lianxifangshi = this.user.lianxifangshi
			this.ro.lianxifangshi = true;


			// 下拉框
			res = await this.$api.option(`chongwuzhonglei`,`chongwuzhonglei`,{});
			this.chongwuzhongleiOptions = res.data;
            this.chongwuzhongleiOptions.unshift("请选择宠物种类");
			// 自定义下拉框值
			this.chongwuxingbieOptions = "公,母".split(',')
			// 自定义下拉框值
			this.xiantianjibingOptions = "是,否".split(',')

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
				res = await this.$api.info(`chongwuxinxi`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='chongwubianhao'){
					this.ruleForm.chongwubianhao = obj[o];
					this.ro.chongwubianhao = true;
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
					if(o=='chongwutupian'){
					this.ruleForm.chongwutupian = obj[o].split(",")[0];
					this.ro.chongwutupian = true;
					continue;
					}
					if(o=='chongwuxingbie'){
					this.ruleForm.chongwuxingbie = obj[o];
					this.ro.chongwuxingbie = true;
					continue;
					}
					if(o=='chongwuxixing'){
					this.ruleForm.chongwuxixing = obj[o];
					this.ro.chongwuxixing = true;
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
					if(o=='chongwunianling'){
					this.ruleForm.chongwunianling = obj[o];
					this.ro.chongwunianling = true;
					continue;
					}
					if(o=='chongwuzhongliang'){
					this.ruleForm.chongwuzhongliang = obj[o];
					this.ro.chongwuzhongliang = true;
					continue;
					}
					if(o=='xiantianjibing'){
					this.ruleForm.xiantianjibing = obj[o];
					this.ro.xiantianjibing = true;
					continue;
					}
					if(o=='chongwuxiangqing'){
					this.ruleForm.chongwuxiangqing = obj[o];
					this.ro.chongwuxiangqing = true;
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
				}
			}
			this.styleChange()
            this.$forceUpdate()
		},
		methods: {
            chongwuxiangqingChange(e) {
                this.ruleForm.chongwuxiangqing = e
            },
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv . .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},

			// 多级联动参数



			// 下拉变化
			chongwuzhongleiChange(e) {
				this.chongwuzhongleiIndex = e.target.value
				this.ruleForm.chongwuzhonglei = this.chongwuzhongleiOptions[this.chongwuzhongleiIndex]
			},
			// 下拉变化
			chongwuxingbieChange(e) {
				this.chongwuxingbieIndex = e.target.value
				this.ruleForm.chongwuxingbie = this.chongwuxingbieOptions[this.chongwuxingbieIndex]
			},
			// 下拉变化
			xiantianjibingChange(e) {
				this.xiantianjibingIndex = e.target.value
				this.ruleForm.xiantianjibing = this.xiantianjibingOptions[this.xiantianjibingIndex]
			},

			chongwutupianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.chongwutupian = 'upload/' + res.file;
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
					let res = await this.$api.list(`chongwuxinxi`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
						return false;
					} else {
                //跨表计算
						if(this.ruleForm.id){
							await this.$api.update(`chongwuxinxi`, this.ruleForm);
						}else{
							await this.$api.add(`chongwuxinxi`, this.ruleForm);
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
                //跨表计算
					if(this.ruleForm.id){
						await this.$api.update(`chongwuxinxi`, this.ruleForm);
					}else{
						await this.$api.add(`chongwuxinxi`, this.ruleForm);
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
