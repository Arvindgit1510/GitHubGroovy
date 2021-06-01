package code.microsystem


def employee=[
	'name':'Arvind',
	'age':32,
	'Address':'Nagpur'
	];
	
	println employee;
	
//	employee.each { 
//		key,value->println("$key  : $value")
//	}

	employee.put('city', 'Orange');
	
	employee.each {
		key,value->println("$key  : $value")
	}
	
	employee.eachWithIndex { key,value,i->
		println "$i | $key | $value"
	}