# RESTful-WebService-With-Security Using SecurityContext

# How To to Create RESTful Webservice with Security in JAVA using SecurityContext ? 

The javax.ws.rs.core.SecurityContext interface provides access to security-related information for a request. The SecurityContext provides functionality similar to javax.servlet.http.HttpServletRequest, enabling you to access the following security-related information:

java.security.Principal object containing the name of the user making the request.

Authentication type used to secure the resource, such as BASIC_AUTH, FORM_AUTH, and CLIENT_CERT_AUTH.

Whether the authenticated user is included in a particular role.

Whether the request was made using a secure channel, such as HTTPS.

You access the SecurityContext by injecting an instance into a class field, setter method, or method parameter using the javax.ws.rs.core.Context annotation.

For more information, see the Javadoc at:

SecurityContext interface: http://docs.oracle.com/javaee/6/api/index.html?javax/ws/rs/core/SecurityContext.html

@Context annotation: http://docs.oracle.com/javaee/6/api/index.html?javax/ws/rs/core/Context.html


