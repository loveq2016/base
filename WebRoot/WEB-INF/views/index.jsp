<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
	<head>
		<title>base系统首页</title>
		<script type="text/javascript"
			src="plug-in/jquery/jquery-1.8.3.min.js"></script>
		<script type="text/javascript" src="plug-in/tools/dataformat.js"></script>
		<link id="easyuiTheme" rel="stylesheet"
			href="plug-in/easyui/themes/default/easyui.css" type="text/css"></link>
		<link rel="stylesheet" href="plug-in/easyui/themes/icon.css"
			type="text/css"></link>
		<link rel="stylesheet" type="text/css"
			href="plug-in/accordion/css/accordion.css">
		<script type="text/javascript"
			src="plug-in/easyui/jquery.easyui.min.1.3.2.js"></script>
		<script type="text/javascript"
			src="plug-in/easyui/locale/easyui-lang-zh_CN.js"></script>
		<script type="text/javascript" src="plug-in/tools/syUtil.js"></script>
		<script type="text/javascript"
			src="plug-in/My97DatePicker/WdatePicker.js"></script>
		<script type="text/javascript"
			src="plug-in/lhgDialog/lhgdialog.min.js?skin=iblue"></script>
		<script type="text/javascript" src="plug-in/tools/curdtools.js"></script>
		<script type="text/javascript" src="plug-in/tools/easyuiextend.js"></script>
		<link rel="shortcut icon" href="images/favicon.ico">
		<link rel="stylesheet" href="plug-in/accordion/css/icons.css"
			type="text/css"></link>
		<link rel="stylesheet" href="plug-in/accordion/css/accordion.css"
			type="text/css"></link>
		<script type="text/javascript" src="plug-in/accordion/js/leftmenu.js"></script>

		<style type="text/css">
a {
	color: Black;
	text-decoration: none;
}

a:hover {
	color: black;
	text-decoration: none;
}
</style>
		<SCRIPT type="text/javascript">
	$(function() {
		$('#layout_east_calendar').calendar({
			fit : true,
			current : new Date(),
			border : false,
			onSelect : function(date) {
				$(this).calendar('moveTo', new Date());
			}
		});

	});
</SCRIPT>
	</head>
	<body class="easyui-layout" style="overflow-y: hidden" scroll="no">
		<!-- 顶部-->
		<div region="north" border="false" title="JEECG_v3.1 Simple版本"
			style="BACKGROUND: #E6E6FA; height: 85px; padding: 1px; overflow: hidden;">
			<table width="100%" border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td align="left" style="vertical-align: text-bottom">
						<img src="plug-in/login/images/toplogo-main.png">
						<!--
      <img src="plug-in/login/images/toplogo.png" width="550" height="52" alt="">-->
					</td>
					<td align="right" nowrap>
						<table>
							<tr>
								<td valign="top" height="50">
									<span style="color: #CC33FF">当前用户:</span>
									<span style="color: #666633">${SPRING_SECURITY_CONTEXT.authentication.principal.userName}</span>
								</td>
							</tr>
							<td>
								<div style="position: absolute; right: 0px; bottom: 0px;">
									<a href="javascript:void(0);" class="easyui-menubutton"
										menu="#layout_north_kzmbMenu" iconCls="icon-help">控制面板</a><a
										href="javascript:void(0);" class="easyui-menubutton"
										menu="#layout_north_zxMenu" iconCls="icon-back">注销</a>
								</div>
								<div id="layout_north_kzmbMenu"
									style="width: 100px; display: none;">
									<div onclick="openwindow('用户信息','userController.do?userinfo')">
										个人信息
									</div>
									<div class="menu-sep"></div>
									<div onclick="add('修改密码','userController.do?changepassword')">
										修改密码
									</div>
								</div>
								<div id="layout_north_zxMenu"
									style="width: 100px; display: none;">
									<div class="menu-sep"></div>
									<div
										onclick="exit('loginController.do?logout','确定退出该系统吗 ?',1);">
										退出系统
									</div>
								</div>
							</td>
							</tr>
						</table>
					</td>
					<td align="right">
						&nbsp;&nbsp;&nbsp;
					</td>
				</tr>
			</table>
		</div>
		<!-- 左侧-->
		<div region="west" split="true" title="导航菜单"
			style="width: 150px; padding: 1px;">
			<div id="nav" class="easyui-accordion" fit="true" border="false">
			    <c:forEach items="${SPRING_SECURITY_CONTEXT.authentication.principal.resourcess}" var="item">
			       <c:if test="${item.parentId eq '0' }">
			           <div title="${item.name }" iconCls="group_add">
							<ul>
							    <c:forEach items="${SPRING_SECURITY_CONTEXT.authentication.principal.resourcess}" var="childItem">
							       <c:if test="${item.id eq childItem.parentId}">
									    <li>
											<div onclick="addTab('${childItem.name}','${childItem.linkUrl}','pictures')"
												title="${childItem.name}" url="userController.do?user" iconCls="pictures">
												<a class="${childItem.name}" href="#"> <span class="icon pictures">&nbsp;</span>
													<span class="nav">${childItem.name}</span>
												</a>
											</div>
										</li>
									</c:if>
							    </c:forEach>
							</ul>
						</div>
			       </c:if>
			    </c:forEach>
            </div>
		</div>
		<!-- 中间-->
		<div id="mainPanle" region="center" style="overflow: hidden;">
			<div id="maintabs" class="easyui-tabs" fit="true" border="false">
				<div class="easyui-tab" title="首页"
					style="padding: 2px; overflow: hidden;">

				</div>
				<c:if test="${map=='1'}">
					<div class="easyui-tab" title="地图"
						style="padding: 1px; overflow: hidden;">

					</div>
				</c:if>
			</div>
		</div>
		<!-- 右侧 -->
		<div collapsed="true" region="east" iconCls="icon-reload" title="辅助工具"
			split="true" style="width: 190px;">
			<div id="tabs" class="easyui-tabs" border="false"
				style="height: 240px">
				<div title="日历" style="padding: 0px; overflow: hidden; color: red;">
					<div id="layout_east_calendar"></div>
				</div>
			</div>
			<div id="tabs" class="easyui-tabs" border="false">
				<div title="在线人员"
					style="padding: 20px; overflow: hidden; color: red;">
				</div>
			</div>
		</div>
		<!-- 底部 -->
		<div region="south" border="false"
			style="height: 25px; overflow: hidden;">
			<div align="center" style="color: #CC99FF; padding-top: 2px">
				&copy; 版权所有
				<span class="tip"><a href="http://www.jeecg.org"
					title="JEECG_v3.1 Simple版本">JEECG_v3.1</a> (推荐谷歌浏览器，获得更快响应速度) 技术支持:<a
					href="#" title="JEECG_v3.1 Simple版本">JEECG_v3.1</a> </span>
			</div>
		</div>
		<div id="mm" class="easyui-menu" style="width: 150px;">
			<div id="mm-tabclose">
				关闭
			</div>
			<div id="mm-tabcloseall">
				全部关闭
			</div>
			<div id="mm-tabcloseother">
				除此之外全部关闭
			</div>
			<div class="menu-sep"></div>
			<div id="mm-tabcloseright">
				当前页右侧全部关闭
			</div>
			<div id="mm-tabcloseleft">
				当前页左侧全部关闭
			</div>
		</div>
	</body>
</html>