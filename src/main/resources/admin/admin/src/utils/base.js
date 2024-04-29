const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootkpvj4/",
            name: "springbootkpvj4",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootkpvj4/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于Java的宠物治疗管理系统"
        } 
    }
}
export default base
