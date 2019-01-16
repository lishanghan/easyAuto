//分页
function pagination(data) {

    $("#total").html("");
    $("#totalPages").html("");
    $("#now").html("");
    $("#pager").html("");

    var total = data.data.total;
    var pages = data.data.pages;
    var now = data.data.pageNum;
    var beforePage = data.data.prePage;
    var nextPage = data.data.nextPage;

    var pagesHtml = "";
    var pageStart = "<a class=\"paginate_button previous disabled\" onclick='pageSkip(" + beforePage + ")' id=\"table_previous\">上一页</a>\n" +
        "            <span id=\"pages\">";
    var pageEnd = "</span>\n" +
        "            <a class=\"paginate_button next disabled\" onclick='pageSkip(" + nextPage + ")' id=\"table_next\">下一页</a>";

    if (pages <= 5) {
        for (var k = 0; k < pages; k++) {
            if ((k + 1) == now) {
                var pageHtml = "<a class=\"paginate_button current\" onclick='pageSkip(" + (k + 1) + ")'>" + (k + 1) + "</a>";
            } else {
                var pageHtml = "<a class=\"paginate_button \" onclick='pageSkip(" + (k + 1) + ")'>" + (k + 1) + "</a>";
            }

            pagesHtml = pagesHtml + pageHtml;
        }

    } else {
        if (now > 4 && now < (pages - 3)) {
            var pagesHtml = "<a class=\"paginate_button\" onclick='pageSkip(1)'>1</a>" +
                "<span> …</span>";
            for (i = (now - 1); i < now + 2; i++) {
                if (i == now) {
                    var pageHtml = "<a class=\"paginate_button current\" onclick='pageSkip(" + (i) + ")'>" + (i) + "</a>";
                } else {
                    var pageHtml = "<a class=\"paginate_button \" onclick='pageSkip(" + (i) + ")'>" + (i) + "</a>";
                }
                pagesHtml = pagesHtml + pageHtml;
            }
            pagesHtml = pagesHtml + "<span> …</span>\n" +
                "<a class=\"paginate_button \" onclick='pageSkip(" + pages + ")'>" + pages + "</a>";


        } else if (now > (pages - 4) && now <= pages) {
            var pagesHtml = "<a class=\"paginate_button\" onclick='pageSkip(1)'>1</a>" +
                "<span> …</span>";
            for (i = (pages - 4); i <= pages; i++) {
                if (i == now) {
                    var pageHtml = "<a class=\"paginate_button current\" onclick='pageSkip(" + (i) + ")'>" + (i) + "</a>";
                } else {
                    var pageHtml = "<a class=\"paginate_button \" onclick='pageSkip(" + (i) + ")'>" + (i) + "</a>";
                }
                pagesHtml = pagesHtml + pageHtml;

            }

        } else if (now > 0 && now <= 4) {

            for (var i = 0; i <= 4; i++) {
                if ((i + 1) == now) {
                    var pageHtml = "<a class=\"paginate_button current\" onclick='pageSkip(" + (i + 1) + ")'>" + (i + 1) + "</a>";
                } else {
                    var pageHtml = "<a class=\"paginate_button \" onclick='pageSkip(" + (i + 1) + ")'>" + (i + 1) + "</a>";
                }

                pagesHtml = pagesHtml + pageHtml;
            }
            pagesHtml = pagesHtml + "<span> …</span>\n" +
                "<a class=\"paginate_button \" onclick='pageSkip(" + pages + ")'>" + pages + "</a>";
        }

    }

    $("#total").append(total);
    $("#totalPages").append(pages);
    $("#now").append(now);
    $("#pager").append(pageStart);
    $("#pages").append(pagesHtml);
    $("#pager").append(pageEnd);

}

//删除列表数据
function del(obj, id, url, ms) {
    /* if (ms == null || ms == "") {
         ms = "请确认是否要删除id=" + id + "的数据！";
     }*/
    layer.confirm(ms, function (index) {
        $.ajax({
            type: 'POST',
            url: url,
            data: {
                id: id
            },
            dataType: 'json',
            success: function (data) {
                var status = data.status;
                var msg = data.msg;
                if (status == 0) {
                    $(obj).parents("tr").remove();
                    pageSkip(1);
                    layer.msg('已删除!', {icon: 1, time: 1000});
                } else {
                    layer.alert(msg, {
                        icon: 0,
                        skin: 'layer-ext-moon'
                    });
                }

            },
            error: function (data) {
                console.log(data);
            },
        });
    });
}

//删除列表数据-json格式请求数据
function del_json(obj, id, url, ms) {
    if (ms == null || ms == "") {
        ms = "请确认是否要删除id=" + id + "的数据！";
    }
    layer.confirm(ms, function (index) {
        //alert("要删除的id="+id);
        var o = new Object();
        o.id = id;
        var json = JSON.stringify(o);
        $.ajax({
            type: 'POST',
            url: url,
            data: json,
            dataType: 'json',
            contentType: 'application/json;charset=utf-8',
            success: function (data) {
                var status = data.status;
                var msg = data.msg;
                if (status == 0) {
                    $(obj).parents("tr").remove();
                    window.location.reload();
                    layer.msg('已删除!', {icon: 1, time: 1000});
                } else {
                    layer.alert(msg, {
                        icon: 0,
                        skin: 'layer-ext-moon'
                    });
                }

            },
            error: function (data) {
                console.log(data);
            },
        });
    });
}

/*function getParameter(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return unescape(r[2]);
    return null;
}*/

function getParameter(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return decodeURI(r[2]);
    return null;
}

/**
 * 枚举相关
 */
//获取枚举值数组
function getAllEnum() {
    var allEnum = null;
    $.ajaxSetup({async: false});
    $.ajax({
        type: "get",
        url: "/enum/allEnum",
        data: {},
        dataType: "json",
        success: function (data) {
            allEnum = data;
        },
        fail: function (data) {
            layer.alert(JSON.stringify(data), {
                icon: 0,
                skin: 'layer-ext-moon'
            });
        },
        error: function (xhr) {
            layer.alert('Error' + JSON.stringify(xhr), {
                icon: 2,
                skin: 'layer-ext-moon'
            });
        }
    });
    return allEnum;
}

// 获取断言枚举值list
function getAssertType() {
    var assertType = null;
    $.ajaxSetup({async: false});
    $.ajax({
        type: "get",
        url: "/enum/assertTypeEnum",
        data: {},
        dataType: "json",
        success: function (data) {
            layer.close(layerIndex);
            assertType = data;
        },
        fail: function (data) {
            layer.close(layerIndex);
            layer.alert(JSON.stringify(data), {
                icon: 0,
                skin: 'layer-ext-moon'
            });
        },
        error: function (xhr) {
            layer.close(layerIndex);
            layer.alert('Error' + JSON.stringify(xhr), {
                icon: 2,
                skin: 'layer-ext-moon'
            });
        }
    });
    return assertType;
}

function getTriggerState() {
    var triggerState = null;

    $.ajax({
        type: "get",
        url: "/enum/triggerState",
        async: false,
        /*data: JSON.stringify(param),
        contentType: "application/json;charset=utf-8",*/
        success: function (res) {
            triggerState = res;
        },
        fail: function (data) {
            layer.alert(JSON.stringify(data), {
                icon: 0,
                skin: 'layer-ext-moon'
            })
        },
        error: function (xhr) {
            layer.alert('Error' + JSON.stringify(xhr), {
                icon: 2,
                skin: 'layer-ext-moon'
            })
        }

    });
    return triggerState;
}

/**
 * 服务(tservice)相关
 */
//获取服务List
function getServiceList() {
    var service = null;
    $.ajaxSetup({async: false});
    $.ajax({
        type: "post",
        url: "/tservice/selectByConditionSimple",
        data: {},
        dataType: "json",
        success: function (data) {
            var status = data.status;
            var msg = data.msg;
            if (status == 0) {
                service = data.data;
            } else {
                layer.alert(data.msg, {
                    icon: 0,
                    skin: 'layer-ext-moon'
                })
            }

        },
        fail: function (data) {
            layer.alert(JSON.stringify(data), {
                icon: 0,
                skin: 'layer-ext-moon'
            })
        },
        error: function (xhr) {
            layer.alert('Error' + JSON.stringify(xhr), {
                icon: 2,
                skin: 'layer-ext-moon'
            })
        }
    });
    return service;
}

//根据tserviceid获取tservice对象
function getServiceByServiceId(serviceId) {
    var service = null;
    $.ajaxSetup({async: false});
    $.ajax({
        type: "post",
        url: "/tservice/selectOne",
        data: {
            tserviceId: serviceId
        },
        dataType: "json",
        success: function (data) {
            var status = data.status;
            if (status == 0) {
                service = data.data;
            } else {
                layer.alert(data.msg, {
                    icon: 0,
                    skin: 'layer-ext-moon'
                })
            }

        },
        fail: function (data) {
            layer.alert(data.msg, {
                icon: 0,
                skin: 'layer-ext-moon'
            })
        },
        error: function (xhr) {
            layer.alert('Error' + data.msg, {
                icon: 2,
                skin: 'layer-ext-moon'
            })
        }
    });
    return service;
}

//根据serviceKey获取测试类列表
function getTClassListByServiceKey(serviceKey) {
    var tClassList = null;
    $.ajaxSetup({async: false});
    $.ajax({
        type: "post",
        url: "/tservice/getTestClassesBySKey",
        data: {
            sKey: serviceKey
        },
        dataType: "json",
        success: function (data) {
            var status = data.status;
            var msg = data.msg;
            if (status == 0) {
                //layer.close(layerIndex);
                tClassList = data.data;
            } else {
                layer.close(layerIndex);
                layer.alert(msg, {
                    icon: 0,
                    skin: 'layer-ext-moon'
                })
            }
        },
        fail: function (data) {
            layer.close(layerIndex);
            layer.alert(JSON.stringify(data), {
                icon: 0,
                skin: 'layer-ext-moon'
            });
        },
        error: function (xhr) {
            layer.close(layerIndex);
            layer.alert('Error' + JSON.stringify(xhr), {
                icon: 2,
                skin: 'layer-ext-moon'
            })
        }
    });
    return tClassList;
}

//根据serviceId获取测试类列表
function getClassesBySId(serviceId) {
    var tClassList = null;
    $.ajaxSetup({async: false});
    $.ajax({
        type: "post",
        url: "/tservice/getTestClassesBySId",
        data: {
            sId: serviceId
        },
        dataType: "json",
        success: function (data) {
            var status = data.status;
            var msg = data.msg;
            if (status == 0) {
                tClassList = data.data;
            } else {
                layer.close(layerIndex);
                layer.alert(msg, {
                    icon: 0,
                    skin: 'layer-ext-moon'
                })
            }
        },
        fail: function (data) {
            layer.close(layerIndex);
            layer.alert(JSON.stringify(data), {
                icon: 0,
                skin: 'layer-ext-moon'
            });
        },
        error: function (xhr) {
            layer.close(layerIndex);
            layer.alert('Error' + JSON.stringify(xhr), {
                icon: 2,
                skin: 'layer-ext-moon'
            })
        }
    });
    return tClassList;
}

/**
 * 接口(ti)相关
 */
//根据接口id查询接口信息
function getTiById(tiId) {
    var ti = null;
    $.ajaxSetup({async: false});
    $.ajax({
        type: "post",
        url: "/ti/selectOne",
        data: {
            id: tiId
        },
        dataType: "json",
        success: function (data) {
            layer.close(layerIndex);
            var status = data.status;
            var msg = data.msg;
            if (status == 0) {
                ti = data.data;
            } else {
                layer.alert(msg, {
                    icon: 0,
                    skin: 'layer-ext-moon'
                })
            }

        },
        fail: function (data) {
            layer.close(layerIndex);
            layer.alert(JSON.stringify(data), {
                icon: 0,
                skin: 'layer-ext-moon'
            })
        },
        error: function (xhr) {
            layer.close(layerIndex);
            layer.alert('Error' + JSON.stringify(xhr), {
                icon: 2,
                skin: 'layer-ext-moon'
            })
        }
    });
    return ti;
}

//根据serviceId 获取接口list
function getTiList(serviceid) {
    var tiList = null;
    $.ajaxSetup({async: false});
    $.ajax({
        type: "post",
        url: "/ti/selectByConditionSimple",
        data: {
            serviceid: serviceid
        },
        dataType: "json",
        success: function (data) {
            var status = data.status;
            var msg = data.msg;
            if (status == 0) {
                layer.close(layerIndex);
                tiList = data.data;
            } else {
                layer.close(layerIndex);
                layer.alert(msg, {
                    icon: 0,
                    skin: 'layer-ext-moon'
                });
            }

        },
        fail: function (data) {
            layer.close(layerIndex);
            layer.alert(JSON.stringify(data), {
                icon: 0,
                skin: 'layer-ext-moon'
            });
        },
        error: function (xhr) {
            layer.close(layerIndex);
            layer.alert('Error' + JSON.stringify(xhr), {
                icon: 2,
                skin: 'layer-ext-moon'
            });
        }
    });
    return tiList;
}

// 根据接口id获取接口示例
function getTitype(iid) {
    var titype;
    $.ajaxSetup({async: false});
    $.ajax({
        type: "post",
        url: "/ti/selectOne",
        data: {
            id: iid
        },
        dataType: "json",
        success: function (data) {
            titype = data.data.iparamtype;
            layer.close(layerIndex);
        },
        fail: function (data) {
            layer.alert(JSON.stringify(data), {
                icon: 0,
                skin: 'layer-ext-moon'
            });
        },
        error: function (xhr) {
            layer.alert('Error' + JSON.stringify(xhr), {
                icon: 2,
                skin: 'layer-ext-moon'
            });
        }
    });
    return titype;

}


/**
 *用例(tcase)相关
 */
//根据用例id查询用例信息
function getTcaseById(caseId) {
    var tcase = null;
    $.ajaxSetup({async: false});
    $.ajax({
        type: "post",
        url: "/tcase/selectOne",
        data: {
            id: caseId
        },
        dataType: "json",
        success: function (data) {
            layer.close(layerIndex);
            var status = data.status;
            var msg = data.msg;
            if (status == 0) {
                tcase = data.data;
            } else {
                layer.alert(msg, {
                    icon: 0,
                    skin: 'layer-ext-moon'
                })
            }

        },
        fail: function (data) {
            layer.close(layerIndex);
            layer.alert(JSON.stringify(data), {
                icon: 0,
                skin: 'layer-ext-moon'
            })
        },
        error: function (xhr) {
            layer.close(layerIndex);
            layer.alert('Error' + JSON.stringify(xhr), {
                icon: 2,
                skin: 'layer-ext-moon'
            })
        }
    });
    return tcase;
}

//根据serviceId 获取服务下所有接口及接口下所有用例
function getAllTiAndCaseByServiceId(serviceId) {
    var all = null;
    $.ajaxSetup({async: false});
    $.ajax({
        type: "post",
        url: "/ti/selectTiWithCaseVO",
        data: {
            serviceid: serviceId
        },
        dataType: "json",
        success: function (data) {
            layer.close(layerIndex);
            var status = data.status;
            var msg = data.msg;
            if (status == 0) {
                all = data.data;
            } else {
                layer.alert(msg, {
                    icon: 0,
                    skin: 'layer-ext-moon'
                })
            }

        },
        fail: function (data) {
            layer.close(layerIndex);
            layer.alert(JSON.stringify(data), {
                icon: 0,
                skin: 'layer-ext-moon'
            })
        },
        error: function (xhr) {
            layer.close(layerIndex);
            layer.alert('Error' + JSON.stringify(xhr), {
                icon: 2,
                skin: 'layer-ext-moon'
            })
        }
    });
    return all;
}


/**
 * 环境(tenv)相关请求
 */
//获取环境List
function getTenvList() {
    var env = null;
    $.ajaxSetup({async: false});
    $.ajax({
        type: "post",
        url: "/tenv/selectAll",
        data: {},
        dataType: "json",
        success: function (data) {
            layer.close(layerIndex);
            var status = data.status;
            var msg = data.msg;
            if (status == 0) {
                env = data.data;
            } else {
                layer.alert(msg, {
                    icon: 0,
                    skin: 'layer-ext-moon'
                })
            }

        },
        fail: function (data) {
            layer.close(layerIndex);
            layer.alert(JSON.stringify(data), {
                icon: 0,
                skin: 'layer-ext-moon'
            })
        },
        error: function (xhr) {
            layer.close(layerIndex);
            layer.alert('Error' + JSON.stringify(xhr), {
                icon: 2,
                skin: 'layer-ext-moon'
            })
        }
    });
    return env;
}

//获取环境List
function getEnvList() {
    var envList = null;
    $.ajaxSetup({async: false});
    $.ajax({
        type: "post",
        url: "/tenv/selectAll",
        data: {},
        dataType: "json",
        success: function (data) {
            envList = data.data;
        },
        fail: function (data) {
            alert(JSON.stringify(data));
        },
        error: function (xhr) {
            alert('error:' + JSON.stringify(xhr));
        }
    });
    return envList;
}

function getCustomList() {
    var list = null;
    $.ajaxSetup({async: false});
    $.ajax({
        type: "post",
        url: "/tcustom/selectByCondition",
        data: {},
        dataType: "json",
        success: function (resp) {
            list = resp.data;
        },
        fail: function (resp) {
            alert(JSON.stringify(resp));
        },
        error: function (resp) {
            alert('error:' + JSON.stringify(resp));
        }
    });
    return list;
}


/**
 * 用户相关的请求
 */
//获取用户组
function userGroup() {
    var usergroup = null;
    $.ajaxSetup({async: false});
    $.ajax({
        type: "get",
        url: "/enum/groupEnum",
        data: {},
        dataType: "json",
        success: function (data) {
            usergroup = data;
        },
        fail: function (data) {
            layer.alert(JSON.stringify(data), {
                icon: 0,
                skin: 'layer-ext-moon'
            });
        },
        error: function (xhr) {
            layer.alert('Error' + JSON.stringify(xhr), {
                icon: 2,
                skin: 'layer-ext-moon'
            })
        }
    });
    return usergroup;
}

//获取技术部人员List
function getUserList() {
    var dev = null;
    var groupId = $.cookie('groupidCookie');
    $.ajaxSetup({async: false});
    $.ajax({
        type: "post",
        url: "/user/selectByCondition",
        data: {},
        dataType: "json",
        success: function (data) {
            var status = data.status;
            var msg = data.msg;
            if (status == 0) {
                //layer.close(layerIndex);
                dev = data.data;
            } else {
                layer.close(layerIndex);
                layer.alert(msg, {
                    icon: 0,
                    skin: 'layer-ext-moon'
                })
            }
        },
        fail: function (data) {
            layer.close(layerIndex);
            layer.alert(JSON.stringify(data), {
                icon: 0,
                skin: 'layer-ext-moon'
            });
        },
        error: function (xhr) {
            layer.close(layerIndex);
            layer.alert('Error' + JSON.stringify(xhr), {
                icon: 2,
                skin: 'layer-ext-moon'
            })
        }
    });
    return dev;
}

function getCustomUsers() {
    var ret = null;
    $.ajax({
        type: "post",
        url: "/user/selectCustomUsers",
        dataType: "json",
        success: function (response) {
            if (response.status == 0) {
                ret = response.data;
            } else {
                layer.close(layerIndex);
                layer.alert(response.msg, {
                    icon: 0,
                    skin: 'layer-ext-moon'
                })
            }
        },
        fail: function (data) {
            layer.close(layerIndex);
            layer.alert(JSON.stringify(data), {
                icon: 0,
                skin: 'layer-ext-moon'
            });
        },
        error: function (xhr) {
            layer.close(layerIndex);
            layer.alert('Error' + JSON.stringify(xhr), {
                icon: 2,
                skin: 'layer-ext-moon'
            })
        }
    });
    return ret;
}

/**
 * 获取case设计人员列表
 */
function getCaseDesigners() {
    var ret = null;
    $.ajax({
        type: "post",
        url: "/user/selectCaseDesigners",
        dataType: "json",
        success: function (response) {
            if (response.status == 0) {
                ret = response.data;
            } else {
                layer.close(layerIndex);
                layer.alert(response.msg, {
                    icon: 0,
                    skin: 'layer-ext-moon'
                })
            }
        },
        fail: function (data) {
            layer.close(layerIndex);
            layer.alert(JSON.stringify(data), {
                icon: 0,
                skin: 'layer-ext-moon'
            });
        },
        error: function (xhr) {
            layer.close(layerIndex);
            layer.alert('Error' + JSON.stringify(xhr), {
                icon: 2,
                skin: 'layer-ext-moon'
            })
        }
    });
    return ret;
}

/**
 *根据接口id查询用例数量
 */
function getTcaseNumByTiId(tiId) {
    var num = 0;
    $.ajaxSetup({async: false});
    $.ajax({
        type: "post",
        url: "/tcase/selectByConditionSimple",
        data: {
            iid: tiId
        },
        dataType: "json",
        success: function (data) {
            layer.close(layerIndex);
            var status = data.status;
            var msg = data.msg;
            if (status == 0) {
                num = data.data.length;
            } else {
                layer.alert(msg, {
                    icon: 0,
                    skin: 'layer-ext-moon'
                })
            }

        },
        fail: function (data) {
            layer.close(layerIndex);
            layer.alert(JSON.stringify(data), {
                icon: 0,
                skin: 'layer-ext-moon'
            })
        },
        error: function (xhr) {
            layer.close(layerIndex);
            layer.alert('Error' + JSON.stringify(xhr), {
                icon: 2,
                skin: 'layer-ext-moon'
            })
        }
    });
    return num;
}

/**
 * 根据接口id作废接口
 * */
function cancelTi(tiId) {
    $.ajaxSetup({async: false});
    $.ajax({
        type: "post",
        url: "/ti/invalidInterface",
        data: {
            id: tiId
        },
        dataType: "json",
        success: function (data) {
            layer.close(layerIndex);
            var status = data.status;
            var msg = data.msg;
            if (status == 0) {
                layer.msg('已作废!', {icon: 1, time: 1000});
            } else {
                layer.alert(msg, {
                    icon: 0,
                    skin: 'layer-ext-moon'
                })
            }

        },
        fail: function (data) {
            layer.close(layerIndex);
            layer.alert(JSON.stringify(data), {
                icon: 0,
                skin: 'layer-ext-moon'
            })
        },
        error: function (xhr) {
            layer.close(layerIndex);
            layer.alert('Error' + JSON.stringify(xhr), {
                icon: 2,
                skin: 'layer-ext-moon'
            })
        }
    });

}

/**
 * 获取replaceEnumExamplesList
 * */
function getReplaceEnumList() {
    var replaceEnumList = null;
    $.ajaxSetup({async: false});
    $.ajax({
        type: "get",
        url: "/enum/replaceEnumExamples",
        data: {},
        dataType: "json",
        success: function (data) {
            replaceEnumList = data;
        },
        fail: function (data) {
            alert(JSON.stringify(data));
        },
        error: function (xhr) {
            alert('error:' + JSON.stringify(xhr));
        }
    });
    return replaceEnumList;
}

/**
 * 设置requestParam的<触发事件
 * */
function setRequestParameter() {
    var replaceObj = getReplaceEnumList();
    for (var i = 0; i < replaceObj.length; i++) {
        // names[i] = names[i].replace("<","").replace(">","");
        replaceObj[i].example = replaceObj[i].example.replace("<", "&lt;").replace(">", "&gt;");
    }
    var names = $.map(replaceObj, function (replaceObj, i) {
        //return {'id':i, 'name':"<"+value+">", 'email': value};
        return {'id': i, 'name': replaceObj.example, 'email': replaceObj.desc};
    });
    var at_config = {
        at: "<",
        data: names,
        headerTpl: '<div class="atwho-header">正则表达式:</div>',
        insertTpl: '${name}',
        displayTpl: "<li>${name} <small>${email}</small></li>",
        limit: 200
    }
    $inputor = $('#requestParam').atwho(at_config);
    $inputor = $('#cafter').atwho(at_config);
    $inputor.focus().atwho('run');
}

/*关闭弹出框口*/
function layer_close() {
    var index = parent.layer.getFrameIndex(window.name);
    parent.layer.close(index);
}

/**
 * 初始化环境下拉列表,将option填充为<option value=envId>envKey</option>
 * @param html_envId-必填,环境下拉框元素的id
 */
function env_selectEle_init(html_envId) {
    var envs = getEnvList();
    var env_select_options = null;
    for (var i = 0; i < envs.length; i++) {
        env_select_options += "<option value='" + envs[i].id + "'>" + envs[i].envkey + "</option>";
    }
    if (env_select_options == null) {
        return;
    }
    try {
        $("#" + html_envId).append(env_select_options);
    } catch (e) {
        console.log("初始化环境列表失败:" + e);
    }
}

/**
 * 初始化服务下拉列表,将option填充为<option value=serviceId>serviceKey</option>
 * @param html_serviceId-必填,服务下拉框元素的id
 */
function service_selectEle_init(html_serviceId) {
    var services = getServiceList();
    var service_select_options = null;
    for (var i = 0; i < services.length; i++) {
        service_select_options += "<option value='" + services[i].id + "'>" + services[i].servicekey + "</option>";
    }
    if (service_select_options != null) {
        try {
            $("#" + html_serviceId).append(service_select_options);
        } catch (e) {
            console.log("初始化服务列表失败:" + e);
        }
    }
}


/**
 * 初始化用户下拉框列表,将option填充为<option value=userId>realName</option>,并且将select标签渲染为select2
 *
 * @param html_userId-必填,用户下拉框元素id
 */
function user_selectEle_init(html_userId) {
    var users = getCustomUsers();
    var user_select_options = "";
    for (var i = 0; i < users.length; i++) {
        user_select_options += "<option value='" + users[i].id + "'>" + users[i].realname + "</option>";
    }
    if (user_select_options != "") {
        try {
            $("#" + html_userId).append(user_select_options);
            $("#" + html_userId).select2();
        } catch (e) {
            console.error("初始化用户列表失败:" + e);
        }
    }
}

function custom_selectEle_init(ele_customId) {
    var customList = getCustomList();
    var options = "";
    for (var i = 0; i < customList.length; i++) {
        options += "<option value='" + customList[i].id + "'>"
            + "(" + customList[i].id + "_" + customList[i].username + "_" + customList[i].envkey + ")"
            + customList[i].customname + "</option>";
    }
    if (options != "") {
        try {
            $("#" + ele_customId).append(options);
            $("#" + ele_customId).select2();
        }
        catch (e) {
            console.error("初始化定制列表下拉失败:" + e)
        }
    }

}


/*
    * type              请求的方式  默认为get
* url               发送请求的地址
* param             发送请求的参数
* isShowLoader      是否显示loader动画  默认为false
* dataType          返回JSON数据  默认为JSON格式数据
* callBack          请求的回调函数
*/
(function () {
    function AjaxRequest(opts) {
        this.type = opts.type || "get";
        this.url = opts.url;
        this.param = opts.param || {};
        this.isShowLoader = opts.isShowLoader || false;
        this.dataType = opts.dataType || "json";
        this.callBack = opts.callBack;
        this.init();
    }

    AjaxRequest.prototype = {
        //初始化
        init: function () {
            this.sendRequest();
        },
        //渲染loader
        showLoader: function () {
            if (this.isShowLoader) {
                var loader = '<div class="ajaxLoader"><div class="loader">加载中...</div></div>';
                $("body").append(loader);
            }
        },
        //隐藏loader
        hideLoader: function () {
            if (this.isShowLoader) {
                $(".ajaxLoader").remove();
            }
        },
        //发送请求
        sendRequest: function () {
            var self = this;
            $.ajax({
                type: this.type,
                url: this.url,
                data: this.param,
                dataType: this.dataType,
                beforeSend: this.showLoader(),
                success: function (res) {
                    self.hideLoader();
                    if (res != null && res != "") {
                        if (self.callBack) {
                            if (Object.prototype.toString.call(self.callBack) === "[object Function]") {   //Object.prototype.toString.call方法--精确判断对象的类型
                                self.callBack(res);
                            } else {
                                console.log("callBack is not a function");
                            }
                        }
                    }
                }
            });
        }
    };

    window.AjaxRequest = AjaxRequest;
})();

/*function timestampToTime(timestamp) {
    var date = new Date(timestamp);//时间戳为10位需*1000，时间戳为13位的话不需乘1000
    var Y = date.getFullYear();
    var M = (date.getMonth() + 1 < 10 ? '0' + (date.getMonth() + 1) : date.getMonth() + 1);
    var D = date.getDate();
    var h = date.getHours();
    var m = date.getMinutes();
    var s = date.getSeconds();
    return Y + "-" + M + "-" + D + " " + h + ":" + m + ":" + s;
}*/


function formatDateTime(inputTime) {

    var date = new Date(inputTime);

    var y = date.getFullYear();

    var m = date.getMonth() + 1;

    m = m < 10 ? ('0' + m) : m;

    var d = date.getDate();

    d = d < 10 ? ('0' + d) : d;

    var h = date.getHours();

    h = h < 10 ? ('0' + h) : h;

    var minute = date.getMinutes();

    var second = date.getSeconds();

    minute = minute < 10 ? ('0' + minute) : minute;

    second = second < 10 ? ('0' + second) : second;

    return y + '-' + m + '-' + d + ' ' + h + ':' + minute + ':' + second;

}































