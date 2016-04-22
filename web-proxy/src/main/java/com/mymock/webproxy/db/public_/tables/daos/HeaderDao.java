/**
 * This class is generated by jOOQ
 */
package com.mymock.webproxy.db.public_.tables.daos;


import com.mymock.webproxy.db.public_.tables.Header;
import com.mymock.webproxy.db.public_.tables.records.HeaderRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HeaderDao extends DAOImpl<HeaderRecord, com.mymock.webproxy.db.public_.tables.pojos.Header, Integer> {

	/**
	 * Create a new HeaderDao without any configuration
	 */
	public HeaderDao() {
		super(Header.HEADER, com.mymock.webproxy.db.public_.tables.pojos.Header.class);
	}

	/**
	 * Create a new HeaderDao with an attached configuration
	 */
	public HeaderDao(Configuration configuration) {
		super(Header.HEADER, com.mymock.webproxy.db.public_.tables.pojos.Header.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(com.mymock.webproxy.db.public_.tables.pojos.Header object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public List<com.mymock.webproxy.db.public_.tables.pojos.Header> fetchById(Integer... values) {
		return fetch(Header.HEADER.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public com.mymock.webproxy.db.public_.tables.pojos.Header fetchOneById(Integer value) {
		return fetchOne(Header.HEADER.ID, value);
	}

	/**
	 * Fetch records that have <code>URL_ID IN (values)</code>
	 */
	public List<com.mymock.webproxy.db.public_.tables.pojos.Header> fetchByUrlId(Integer... values) {
		return fetch(Header.HEADER.URL_ID, values);
	}

	/**
	 * Fetch records that have <code>HEADER_NAME IN (values)</code>
	 */
	public List<com.mymock.webproxy.db.public_.tables.pojos.Header> fetchByHeaderName(String... values) {
		return fetch(Header.HEADER.HEADER_NAME, values);
	}

	/**
	 * Fetch records that have <code>HEADER_VALUE IN (values)</code>
	 */
	public List<com.mymock.webproxy.db.public_.tables.pojos.Header> fetchByHeaderValue(String... values) {
		return fetch(Header.HEADER.HEADER_VALUE, values);
	}
}
