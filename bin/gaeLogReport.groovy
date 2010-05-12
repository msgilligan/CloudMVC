#!/usr/bin/env groovy
File logFile = new File(args[0]);

char sepChar = 0
java.lang.String sepStr = sepChar	 // Character.toString(sepChar);
writer = new StringWriter()
builder = new groovy.xml.MarkupBuilder(writer)

html = builder.html {
	head()
	body {
		logFile.eachLine{ line ->
			parts = line.split(sepStr)
			if (parts[0])
			{
				div(class: "entry") {
					h4(class: "apache", parts[0]) 
					if (parts.length > 1)
					{
						ul
						{
							for (def i = 1; i < parts.length; i++ )
							{
								if (parts[i] != ": ")
								{
									li(class: "trace", parts[i])
								}
							}
						}
					}
				}
			}
		}
	}
}

println writer.toString()