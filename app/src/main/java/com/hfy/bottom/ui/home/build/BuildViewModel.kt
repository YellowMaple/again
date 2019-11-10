package com.hfy.bottom.ui.home.build

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hfy.bottom.domain.Sport

class BuildViewModel : ViewModel() {
    private  val _sportsLiveData =MutableLiveData<List<Sport>>()
    val sportsLiveData : LiveData<List<Sport>>
        get()=_sportsLiveData

    init {
        _sportsLiveData.value = listOf(
            Sport("1","羽毛球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","网球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","足球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","篮球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21"),
            Sport("1","乒乓球","航天杯", date = listOf("20191109"),locations = listOf("504"),sponsors = listOf("李宁"),managers = listOf("林丹"),referees = listOf("李宗伟"),players = listOf("谌龙"),rule = "21")
        )
    }
}