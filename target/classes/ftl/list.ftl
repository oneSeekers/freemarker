<html>

	<head>ѧ���б�</head>
	<body>
		<table>
			<tr>
				<td>���</td>
				<td>id</td>
				<td>����</td>
				<td>�Ա�</td>
				<td>��ַ</td>
			</tr>
			
			<#list list as user>
				<tr>
				<td>${user_index}</td>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.sex}</td>
				<td>${user.address}</td>
			</tr>
			</#list>
		</table>
	</body>

</html>