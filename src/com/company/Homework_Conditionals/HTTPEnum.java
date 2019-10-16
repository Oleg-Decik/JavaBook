
package com.company.Homework_Conditionals;

public class HTTPEnum {
	
	enum HTTP {
		
		F400 ( "The server cannot or will not process the request due to an apparent client error " +
				"(e.g., malformed request syntax, size too large, invalid request message framing, or deceptive " +
				"request routing)." ),
		F401 ( "Similar to 403 Forbidden, but specifically for use when authentication is required and has " +
				"failed or has not yet been provided. The response must include a WWW-Authenticate header field " +
				"containing a challenge applicable to the requested resource." ),
		F402 ( "Reserved for future use. The original intention was that this code might be used as part of " +
				"some form of digital cash or micropayment scheme, as proposed, for example, by GNU Taler," +
				"but that has not yet happened, and this code is not usually used." ),
		F403 ( "The request contained valid data and was understood by the server, but the server is refusing action." );
		
		private final String description;
		
		HTTP ( String descr ) {
			description = descr;
		}
		
		public String getDescription () {
			return description;
		}
		
	}
	
}
