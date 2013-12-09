<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>系统首页</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<%@include file="common/common.jsp"%>
</head>

<body class="easyui-layout" style="overflow-y: hidden" scroll="no">
	<!-- 顶部-->
	<div region="north" border="false" title="管理系统" style="BACKGROUND: #E6E6FA; height: 85px; padding: 1px; overflow: hidden;">
		<table width="100%" border="0" cellpadding="0" cellspacing="0">
			<tr>
				<td align="right">
					<table>
						<tr>
							<td valign="top" height="50"><span style="color: #CC33FF">当前用户:</span> <span style="color: #666633">${SPRING_SECURITY_CONTEXT.authentication.principal.userName}</span> <span style="color: #666633"><a href="logout">退出</a></span></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</div>


	<!-- 左侧-->
	<div region="west" split="true" title="导航菜单" style="width: 150px; padding: 1px;">
		<div id="nav" class="easyui-accordion" fit="true" border="false">
			<c:forEach items="${SPRING_SECURITY_CONTEXT.authentication.principal.resourcess}" var="item">
				<c:if test="${item.parentId eq '-1' }">
					<div title="${item.name }" iconCls="group_add">
						<ul>
							<c:forEach items="${SPRING_SECURITY_CONTEXT.authentication.principal.resourcess}" var="childItem">
								<c:if test="${item.id eq childItem.parentId}">
									<li>
										<div onclick="addTab(this)" isIframe="true" title="${childItem.name}"  url="${childItem.linkUrl}" iconCls="pictures">
											<a class="${childItem.name}" href="javascript:void(0);"> <span class="icon pictures">&nbsp;</span> <span class="nav">${childItem.name}</span>
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
			<div class="easyui-tab" title="首页" style="padding: 2px; overflow: hidden;"></div>
		</div>
	</div>


	<!-- 右侧 -->
	<div collapsed="true" region="east" iconCls="icon-reload" title="辅助工具" split="true" style="width: 190px;">
		<div id="tabs" class="easyui-tabs" border="false" style="height: 240px">
			<div title="日历" style="padding: 0px; overflow: hidden; color: red;">
				<div id="layout_east_calendar"></div>
			</div>
		</div>
		<div id="tabs" class="easyui-tabs" border="false">
			<div title="在线人员" style="padding: 20px; overflow: hidden; color: red;"></div>
		</div>
	</div>


	<!-- 底部 -->
	<div region="south" border="false" style="height: 25px; overflow: hidden;">
		<div align="center" style="color: #CC99FF; padding-top: 2px">
			&copy; 版权所有 <span class="tip"> </span>
		</div>
	</div>

</body>
</html>
