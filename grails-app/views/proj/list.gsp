<!DOCTYPE html>
<html>
	<head>
  
		<title> My Project List </title>
	</head>
	<body>
	 	
			
		      <b> My Project Lists
		    
		       <table border="1">
		       
		                <g:each in="${allproj}"  var="thisProj">
		                      <tr>
		                           <td> ${thisProj.name} </td>
		                           <td> ${thisProj.cat} </td>
		                       </tr>
		                 </g:each>    
		                
		        </table>
	   
	   
	</body>
	
</html>