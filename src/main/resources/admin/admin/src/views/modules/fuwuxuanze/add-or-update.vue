<template>
	<div class="addEdit-block" :style='{"padding":"30px","background":"url(http://codegen.caihongy.cn/20220730/4b6f6d88fde34446904f3e1cd2807e39.png) center center/cover fixed no-repeat","height":"calc(100vh - 120px)"}' style="width: 100%;">
		<el-form
			:style='{"padding":"30px","boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.3020)","borderRadius":"0","flexWrap":"wrap","background":"#fff","display":"flex"}'
			class="add-update-preview"
			ref="ruleForm"
			:model="ruleForm"
			:rules="rules"
			label-width="100px"
		>
			<template >
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'" label="选择编号" prop="xuanzebianhao">
					<el-input v-model="ruleForm.xuanzebianhao" placeholder="选择编号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' class="input" v-else-if="ruleForm.xuanzebianhao" label="选择编号" prop="xuanzebianhao">
					<el-input v-model="ruleForm.xuanzebianhao" placeholder="选择编号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="服务项目" prop="fuwuxiangmu">
					<el-input v-model="ruleForm.fuwuxiangmu" placeholder="服务项目" clearable  :readonly="ro.fuwuxiangmu"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' v-else class="input" label="服务项目" prop="fuwuxiangmu">
					<el-input v-model="ruleForm.fuwuxiangmu" placeholder="服务项目" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="服务类型" prop="fuwuleixing">
					<el-input v-model="ruleForm.fuwuleixing" placeholder="服务类型" clearable  :readonly="ro.fuwuleixing"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' v-else class="input" label="服务类型" prop="fuwuleixing">
					<el-input v-model="ruleForm.fuwuleixing" placeholder="服务类型" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' class="upload" v-if="type!='info' && !ro.fuwufengmian" label="服务封面" prop="fuwufengmian">
					<file-upload
						tip="点击上传服务封面"
						action="file/upload"
						:limit="3"
						:multiple="true"
						:fileUrls="ruleForm.fuwufengmian?ruleForm.fuwufengmian:''"
						@change="fuwufengmianUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' class="upload" v-else-if="ruleForm.fuwufengmian" label="服务封面" prop="fuwufengmian">
					<img v-if="ruleForm.fuwufengmian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.fuwufengmian.split(',')[0]" width="100" height="100">
					<img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.fuwufengmian.split(',')" :src="$base.url+item" width="100" height="100">
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="服务价格" prop="fuwujiage">
					<el-input v-model="ruleForm.fuwujiage" placeholder="服务价格" clearable  :readonly="ro.fuwujiage"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' v-else class="input" label="服务价格" prop="fuwujiage">
					<el-input v-model="ruleForm.fuwujiage" placeholder="服务价格" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="用户账号" prop="yonghuzhanghao">
					<el-input v-model="ruleForm.yonghuzhanghao" placeholder="用户账号" clearable  :readonly="ro.yonghuzhanghao"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' v-else class="input" label="用户账号" prop="yonghuzhanghao">
					<el-input v-model="ruleForm.yonghuzhanghao" placeholder="用户账号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="用户姓名" prop="yonghuxingming">
					<el-input v-model="ruleForm.yonghuxingming" placeholder="用户姓名" clearable  :readonly="ro.yonghuxingming"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' v-else class="input" label="用户姓名" prop="yonghuxingming">
					<el-input v-model="ruleForm.yonghuxingming" placeholder="用户姓名" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="联系方式" prop="lianxifangshi">
					<el-input v-model="ruleForm.lianxifangshi" placeholder="联系方式" clearable  :readonly="ro.lianxifangshi"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' v-else class="input" label="联系方式" prop="lianxifangshi">
					<el-input v-model="ruleForm.lianxifangshi" placeholder="联系方式" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' class="select" v-if="type!='info'" label="宠物昵称" prop="chongwunicheng">
					<el-select :disabled="ro.chongwunicheng" @change="chongwunichengChange" v-model="ruleForm.chongwunicheng" placeholder="请选择宠物昵称">
						<el-option
							v-for="(item,index) in chongwunichengOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' class="input" v-else-if="ruleForm.chongwunicheng" label="宠物昵称" prop="chongwunicheng">
					<el-input v-model="ruleForm.chongwunicheng" placeholder="宠物昵称" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="宠物种类" prop="chongwuzhonglei">
					<el-input v-model="ruleForm.chongwuzhonglei" placeholder="宠物种类" clearable  :readonly="ro.chongwuzhonglei"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' v-else class="input" label="宠物种类" prop="chongwuzhonglei">
					<el-input v-model="ruleForm.chongwuzhonglei" placeholder="宠物种类" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="宠物性别" prop="chongwuxingbie">
					<el-input v-model="ruleForm.chongwuxingbie" placeholder="宠物性别" clearable  :readonly="ro.chongwuxingbie"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' v-else class="input" label="宠物性别" prop="chongwuxingbie">
					<el-input v-model="ruleForm.chongwuxingbie" placeholder="宠物性别" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="宠物品种" prop="chongwupinzhong">
					<el-input v-model="ruleForm.chongwupinzhong" placeholder="宠物品种" clearable  :readonly="ro.chongwupinzhong"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' v-else class="input" label="宠物品种" prop="chongwupinzhong">
					<el-input v-model="ruleForm.chongwupinzhong" placeholder="宠物品种" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="宠物毛色" prop="chongwumaose">
					<el-input v-model="ruleForm.chongwumaose" placeholder="宠物毛色" clearable  :readonly="ro.chongwumaose"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' v-else class="input" label="宠物毛色" prop="chongwumaose">
					<el-input v-model="ruleForm.chongwumaose" placeholder="宠物毛色" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' class="date" v-if="type!='info'" label="选择日期" prop="xuanzeriqi">
					<el-date-picker
						format="yyyy 年 MM 月 dd 日"
						value-format="yyyy-MM-dd"
						v-model="ruleForm.xuanzeriqi" 
						type="date"
						:readonly="ro.xuanzeriqi"
						placeholder="选择日期"
					></el-date-picker> 
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' class="input" v-else-if="ruleForm.xuanzeriqi" label="选择日期" prop="xuanzeriqi">
					<el-input v-model="ruleForm.xuanzeriqi" placeholder="选择日期" readonly></el-input>
				</el-form-item>
			</template>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' v-if="type!='info'"  label="内容" prop="neirong">
					<editor 
						style="min-width: 200px; max-width: 600px;"
						v-model="ruleForm.neirong" 
						class="editor" 
						action="file/upload">
					</editor>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 20px 0"}' v-else-if="ruleForm.neirong" label="内容" prop="neirong">
                    <span :style='{"fontSize":"14px","lineHeight":"1.5","color":"#000","fontWeight":"500","display":"inline-block"}' v-html="ruleForm.neirong"></span>
                </el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0"}' class="btn">
				<el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"30px","background":"#4662A1","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}'  v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
				<el-button :style='{"border":"0px solid rgba(64, 158, 255, 1)","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#fff","borderRadius":"30px","background":"#4662A1","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
				<el-button :style='{"border":"0px solid rgba(64, 158, 255, 1)","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#fff","borderRadius":"30px","background":"#4662A1","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
			</el-form-item>
		</el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
	data() {
		let self = this
		var validateIdCard = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!checkIdCard(value)) {
				callback(new Error("请输入正确的身份证号码"));
			} else {
				callback();
			}
		};
		var validateUrl = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isURL(value)) {
				callback(new Error("请输入正确的URL地址"));
			} else {
				callback();
			}
		};
		var validateMobile = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isMobile(value)) {
				callback(new Error("请输入正确的手机号码"));
			} else {
				callback();
			}
		};
		var validatePhone = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isPhone(value)) {
				callback(new Error("请输入正确的电话号码"));
			} else {
				callback();
			}
		};
		var validateEmail = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isEmail(value)) {
				callback(new Error("请输入正确的邮箱地址"));
			} else {
				callback();
			}
		};
		var validateNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isNumber(value)) {
				callback(new Error("请输入数字"));
			} else {
				callback();
			}
		};
		var validateIntNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isIntNumer(value)) {
				callback(new Error("请输入整数"));
			} else {
				callback();
			}
		};
		return {
			id: '',
			type: '',
			
			
			ro:{
				xuanzebianhao : false,
				fuwuxiangmu : false,
				fuwuleixing : false,
				fuwufengmian : false,
				fuwujiage : false,
				yonghuzhanghao : false,
				yonghuxingming : false,
				lianxifangshi : false,
				chongwunicheng : false,
				chongwuzhonglei : false,
				chongwuxingbie : false,
				chongwupinzhong : false,
				chongwumaose : false,
				xuanzeriqi : false,
				neirong : false,
				ispay : false,
			},
			
			
			ruleForm: {
				xuanzebianhao: this.getUUID(),
				fuwuxiangmu: '',
				fuwuleixing: '',
				fuwufengmian: '',
				fuwujiage: '',
				yonghuzhanghao: '',
				yonghuxingming: '',
				lianxifangshi: '',
				chongwunicheng: '',
				chongwuzhonglei: '',
				chongwuxingbie: '',
				chongwupinzhong: '',
				chongwumaose: '',
				xuanzeriqi: '',
				neirong: '',
			},
		
			chongwunichengOptions: [],
			
			rules: {
				xuanzebianhao: [
				],
				fuwuxiangmu: [
				],
				fuwuleixing: [
				],
				fuwufengmian: [
				],
				fuwujiage: [
					{ validator: validateNumber, trigger: 'blur' },
				],
				yonghuzhanghao: [
				],
				yonghuxingming: [
				],
				lianxifangshi: [
				],
				chongwunicheng: [
				],
				chongwuzhonglei: [
				],
				chongwuxingbie: [
				],
				chongwupinzhong: [
				],
				chongwumaose: [
				],
				xuanzeriqi: [
				],
				neirong: [
				],
				ispay: [
				],
			}
		};
	},
	props: ["parent"],
	computed: {



	},
    components: {
    },
	created() {
		this.ruleForm.xuanzeriqi = this.getCurDate()
	},
	methods: {
		
		// 下载
		download(file){
			window.open(`${file}`)
		},
		// 初始化
		init(id,type) {
			if (id) {
				this.id = id;
				this.type = type;
			}
			if(this.type=='info'||this.type=='else'){
				this.info(id);
			}else if(this.type=='logistics'){
				this.logistics=false;
				this.info(id);
			}else if(this.type=='cross'){
				var obj = this.$storage.getObj('crossObj');
				for (var o in obj){
						if(o=='xuanzebianhao'){
							this.ruleForm.xuanzebianhao = obj[o];
							this.ro.xuanzebianhao = true;
							continue;
						}
						if(o=='fuwuxiangmu'){
							this.ruleForm.fuwuxiangmu = obj[o];
							this.ro.fuwuxiangmu = true;
							continue;
						}
						if(o=='fuwuleixing'){
							this.ruleForm.fuwuleixing = obj[o];
							this.ro.fuwuleixing = true;
							continue;
						}
						if(o=='fuwufengmian'){
							this.ruleForm.fuwufengmian = obj[o];
							this.ro.fuwufengmian = true;
							continue;
						}
						if(o=='fuwujiage'){
							this.ruleForm.fuwujiage = obj[o];
							this.ro.fuwujiage = true;
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
						if(o=='xuanzeriqi'){
							this.ruleForm.xuanzeriqi = obj[o];
							this.ro.xuanzeriqi = true;
							continue;
						}
						if(o=='neirong'){
							this.ruleForm.neirong = obj[o];
							this.ro.neirong = true;
							continue;
						}
				}
				
















			}
			
			
			// 获取用户信息
			this.$http({
				url: `${this.$storage.get('sessionTable')}/session`,
				method: "get"
			}).then(({ data }) => {
				if (data && data.code === 0) {
					
					var json = data.data;
					if(((json.yonghuzhanghao!=''&&json.yonghuzhanghao) || json.yonghuzhanghao==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.yonghuzhanghao = json.yonghuzhanghao
						this.ro.yonghuzhanghao = true;
					}
					if(((json.yonghuxingming!=''&&json.yonghuxingming) || json.yonghuxingming==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.yonghuxingming = json.yonghuxingming
						this.ro.yonghuxingming = true;
					}
					if(((json.lianxifangshi!=''&&json.lianxifangshi) || json.lianxifangshi==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.lianxifangshi = json.lianxifangshi
						this.ro.lianxifangshi = true;
					}
				} else {
					this.$message.error(data.msg);
				}
			});
			
            this.$http({
				url: `option/chongwuxinxi/chongwunicheng`,
				method: "get"
            }).then(({ data }) => {
				if (data && data.code === 0) {
					this.chongwunichengOptions = data.data;
				} else {
					this.$message.error(data.msg);
				}
            });
			
		},
			// 下二随
			chongwunichengChange () {
				this.$http({
					url: `follow/chongwuxinxi/chongwunicheng?columnValue=`+ this.ruleForm.chongwunicheng,
					method: "get"
				}).then(({ data }) => {
					if (data && data.code === 0) {
						if(data.data.chongwuzhonglei){
							this.ruleForm.chongwuzhonglei = data.data.chongwuzhonglei
						}
						if(data.data.chongwuxingbie){
							this.ruleForm.chongwuxingbie = data.data.chongwuxingbie
						}
						if(data.data.chongwupinzhong){
							this.ruleForm.chongwupinzhong = data.data.chongwupinzhong
						}
						if(data.data.chongwumaose){
							this.ruleForm.chongwumaose = data.data.chongwumaose
						}
					} else {
						this.$message.error(data.msg);
					}
				});
			},
    // 多级联动参数

    info(id) {
      this.$http({
        url: `fuwuxuanze/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
        //解决前台上传图片后台不显示的问题
        let reg=new RegExp('../../../upload','g')//g代表全部
        this.ruleForm.neirong = this.ruleForm.neirong.replace(reg,'../../../springbootkpvj4/upload');
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {








	if(this.ruleForm.fuwufengmian!=null) {
		this.ruleForm.fuwufengmian = this.ruleForm.fuwufengmian.replace(new RegExp(this.$base.url,"g"),"");
	}

























var objcross = this.$storage.getObj('crossObj');

      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(statusColumnName && !statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
       this.$refs["ruleForm"].validate(valid => {
         if (valid) {
		 if(crossrefid && crossuserid) {
			 this.ruleForm.crossuserid = crossuserid;
			 this.ruleForm.crossrefid = crossrefid;
			let params = { 
				page: 1, 
				limit: 10, 
				crossuserid:this.ruleForm.crossuserid,
				crossrefid:this.ruleForm.crossrefid,
			} 
			this.$http({ 
				url: "fuwuxuanze/page", 
				method: "get", 
				params: params 
			}).then(({ 
				data 
			}) => { 
				if (data && data.code === 0) { 
				       if(data.data.total>=crossoptnum) {
					     this.$message.error(this.$storage.get('tips'));
					       return false;
				       } else {
					 this.$http({
					   url: `fuwuxuanze/${!this.ruleForm.id ? "save" : "update"}`,
					   method: "post",
					   data: this.ruleForm
					 }).then(({ data }) => {
					   if (data && data.code === 0) {
					     this.$message({
					       message: "操作成功",
					       type: "success",
					       duration: 1500,
					       onClose: () => {
						 this.parent.showFlag = true;
						 this.parent.addOrUpdateFlag = false;
						 this.parent.fuwuxuanzeCrossAddOrUpdateFlag = false;
						 this.parent.search();
						 this.parent.contentStyleChange();
					       }
					     });
					   } else {
					     this.$message.error(data.msg);
					   }
					 });

				       }
				} else { 
				} 
			});
		 } else {
			 this.$http({
			   url: `fuwuxuanze/${!this.ruleForm.id ? "save" : "update"}`,
			   method: "post",
			   data: this.ruleForm
			 }).then(({ data }) => {
			   if (data && data.code === 0) {
			     this.$message({
			       message: "操作成功",
			       type: "success",
			       duration: 1500,
			       onClose: () => {
				 this.parent.showFlag = true;
				 this.parent.addOrUpdateFlag = false;
				 this.parent.fuwuxuanzeCrossAddOrUpdateFlag = false;
				 this.parent.search();
				 this.parent.contentStyleChange();
			       }
			     });
			   } else {
			     this.$message.error(data.msg);
			   }
			 });
		 }
         }
       });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.fuwuxuanzeCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    fuwufengmianUploadChange(fileUrls) {
	    this.ruleForm.fuwufengmian = fileUrls;
    },
  }
};
</script>
<style lang="scss" scoped>
	.amap-wrapper {
		width: 100%;
		height: 500px;
	}
	
	.search-box {
		position: absolute;
	}
	
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  	  padding: 0 10px 0 0;
	  	  color: #000;
	  	  font-weight: 500;
	  	  width: 100px;
	  	  font-size: 14px;
	  	  line-height: 40px;
	  	  text-align: right;
	  	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 100px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  	  border: 2px solid #4662A1;
	  	  border-radius: 0;
	  	  padding: 0 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: #000;
	  	  width: 400px;
	  	  font-size: 14px;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  	  border: 2px solid #4662A1;
	  	  border-radius: 0;
	  	  padding: 0 10px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: #000;
	  	  width: auto;
	  	  font-size: 14px;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  	  border: 2px solid #4662A1;
	  	  border-radius: 0;
	  	  padding: 0 10px 0 30px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: #000;
	  	  width: auto;
	  	  font-size: 14px;
	  	  height: 40px;
	  	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  	  border: 2px dashed #4662A1;
	  	  cursor: pointer;
	  	  border-radius: 6px;
	  	  color: #4662A1;
	  	  width: 90px;
	  	  font-size: 32px;
	  	  line-height: 90px;
	  	  text-align: center;
	  	  height: 90px;
	  	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  	  border: 2px dashed #4662A1;
	  	  cursor: pointer;
	  	  border-radius: 6px;
	  	  color: #4662A1;
	  	  width: 90px;
	  	  font-size: 32px;
	  	  line-height: 90px;
	  	  text-align: center;
	  	  height: 90px;
	  	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  	  border: 2px dashed #4662A1;
	  	  cursor: pointer;
	  	  border-radius: 6px;
	  	  color: #4662A1;
	  	  width: 90px;
	  	  font-size: 32px;
	  	  line-height: 90px;
	  	  text-align: center;
	  	  height: 90px;
	  	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  	  border: 2px solid #4662A1;
	  	  border-radius: 0;
	  	  padding: 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: #000;
	  	  width: 400px;
	  	  font-size: 14px;
	  	  height: 120px;
	  	}
</style>
