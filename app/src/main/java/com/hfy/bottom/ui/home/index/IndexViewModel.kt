package com.hfy.bottom.ui.home.index

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hfy.bottom.domain.Match

class IndexViewModel : ViewModel()  {
    private  val _sportsLiveData =MutableLiveData<List<Match>>()
    val sportsLiveData : LiveData<List<Match>>
        get()=_sportsLiveData

    init {
//        _sportsLiveData.value = listOf("羽毛球","网球","足球","篮球","乒乓球")
        _sportsLiveData.value = listOf(
            Match("1","羽球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","网球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","足球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21"),
            Match("1","乒球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),posters = listOf("http://163.com/110"),rule = "21")
        )
    }
}