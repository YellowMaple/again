
package com.hfy.bottom.domain

data class Sport(
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
