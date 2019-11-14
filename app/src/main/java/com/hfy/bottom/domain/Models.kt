
package com.hfy.bottom.domain

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