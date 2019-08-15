/**
 *	Represents	an	Author	with	their	details--name,	email	and	physical	address
 *
 *	@author	therapon
 *
 */

public class Author {
    private Person	person;
    private Email email;
    private Address address;
    /**
     *	Creates	a	new	author	given	the	author's	name,	email	and	address	as	strings.
     *
     *	@param	person	the	author's location where he/she has name
     *	@param	email	the	author's	email	address
     *	@param	address	the	authors	physical	address
     */
    public Author(Person person, Email email, Address address) {
        this.person = person;
        this.email = email;
        this.address = address;
    }
    /**
     *	@return	the	name
     */
    public String getName() {

        return (this.person.getFirstName() + " " + this.person.getLastName());
    }
    /**
     *	@return	the	email
     */
    public String getEmail() {

        return (this.email.getLoginName() + "@" + this.email.getDomain());
    }
    /**
     *	@return	the	address
     */
    public String getAddress() {

        return this.address.getStreetNumber() + " " + this.address.getStreetName() + " "
                + this.address.getCityName() + " " + this.address.getStateAcronym() + " "
                + this.address.getZipCode() + " " + this.address.getCountryName();
    }
}