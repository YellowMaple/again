
package com.hfy.bottom.domain

data class Match(
        var id:String?="1",//id
        var type: String ="羽毛球",//运动类别
        var name:String="航天杯",//比赛名称
        var date:List<String>?,//比赛时间
        var locations:List<String>?,//地点
        var sponsors:List<String>?,//赞助商
        var managers:List<String>?,//管理员
        var referees:List<String>?,//裁判
        var players:List<String>?,//运动员吧
        var rule:String?//规则
)
enum class Sports(val id:Int,val type: String){
        Badminton(1,"羽毛球"),
        Tennis(2,"网球"),
        Basketball(3,"篮球"),
        Football(4,"足球"),
        Pingpang(5,"乒乓球"),
        Volleyball(6,"排球"),
        OneHundred(7,"100米"),
        TwoHundred(8,"200米"),
        FourHundred(9,"400米"),
        OneTAndHalfTousand(10,"1500米"),
        ThreeThousand(11,"3000米"),
        FiveThousand(12,"5000米"),
        TenThousand(13,"10000米"),
        StandingLongJump(14,"立定跳远"),
        Javelin(15,"标枪"),
        Discus(16,"铁饼"),
        ShotOut(17,"铅球"),
        Sockert(18,"橄榄球"),
        Baseball(19,"棒球"),
        Walking(20,"竞走"),
        Marathon(21,"马拉松"),
        Hurdles(22,"跨栏"),
        SteepleChase(23,"障碍赛"),
        PoleJump(24,"撑杆跳"),
        RelayRace(25,"接力赛"),
        Crawl(26,"蛙泳"),
        FreeStyle(27,"自由泳"),
        IndividualSpringboard(28,"3米跳板"),
        IndividualPlatform(29,"10米跳台")
}

//{
//        val matchList = listOf(
//
//                Match("1","羽毛球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","网球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","足球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
//                Match("1","乒乓球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21")
//
//        )
//}