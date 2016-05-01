/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.information_schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.example.gradle.db.information_schema.tables.InnodbFtIndexCache;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


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
public class InnodbFtIndexCacheRecord extends TableRecordImpl<InnodbFtIndexCacheRecord> implements Record6<String, ULong, ULong, ULong, ULong, ULong> {

	private static final long serialVersionUID = 1599220974;

	/**
	 * Setter for <code>information_schema.INNODB_FT_INDEX_CACHE.WORD</code>.
	 */
	public void setWord(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_FT_INDEX_CACHE.WORD</code>.
	 */
	public String getWord() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.INNODB_FT_INDEX_CACHE.FIRST_DOC_ID</code>.
	 */
	public void setFirstDocId(ULong value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_FT_INDEX_CACHE.FIRST_DOC_ID</code>.
	 */
	public ULong getFirstDocId() {
		return (ULong) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.INNODB_FT_INDEX_CACHE.LAST_DOC_ID</code>.
	 */
	public void setLastDocId(ULong value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_FT_INDEX_CACHE.LAST_DOC_ID</code>.
	 */
	public ULong getLastDocId() {
		return (ULong) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.INNODB_FT_INDEX_CACHE.DOC_COUNT</code>.
	 */
	public void setDocCount(ULong value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_FT_INDEX_CACHE.DOC_COUNT</code>.
	 */
	public ULong getDocCount() {
		return (ULong) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.INNODB_FT_INDEX_CACHE.DOC_ID</code>.
	 */
	public void setDocId(ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_FT_INDEX_CACHE.DOC_ID</code>.
	 */
	public ULong getDocId() {
		return (ULong) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.INNODB_FT_INDEX_CACHE.POSITION</code>.
	 */
	public void setPosition(ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_FT_INDEX_CACHE.POSITION</code>.
	 */
	public ULong getPosition() {
		return (ULong) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, ULong, ULong, ULong, ULong, ULong> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, ULong, ULong, ULong, ULong, ULong> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return InnodbFtIndexCache.INNODB_FT_INDEX_CACHE.WORD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field2() {
		return InnodbFtIndexCache.INNODB_FT_INDEX_CACHE.FIRST_DOC_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field3() {
		return InnodbFtIndexCache.INNODB_FT_INDEX_CACHE.LAST_DOC_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field4() {
		return InnodbFtIndexCache.INNODB_FT_INDEX_CACHE.DOC_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field5() {
		return InnodbFtIndexCache.INNODB_FT_INDEX_CACHE.DOC_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field6() {
		return InnodbFtIndexCache.INNODB_FT_INDEX_CACHE.POSITION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getWord();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value2() {
		return getFirstDocId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value3() {
		return getLastDocId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value4() {
		return getDocCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value5() {
		return getDocId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value6() {
		return getPosition();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbFtIndexCacheRecord value1(String value) {
		setWord(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbFtIndexCacheRecord value2(ULong value) {
		setFirstDocId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbFtIndexCacheRecord value3(ULong value) {
		setLastDocId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbFtIndexCacheRecord value4(ULong value) {
		setDocCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbFtIndexCacheRecord value5(ULong value) {
		setDocId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbFtIndexCacheRecord value6(ULong value) {
		setPosition(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbFtIndexCacheRecord values(String value1, ULong value2, ULong value3, ULong value4, ULong value5, ULong value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InnodbFtIndexCacheRecord
	 */
	public InnodbFtIndexCacheRecord() {
		super(InnodbFtIndexCache.INNODB_FT_INDEX_CACHE);
	}

	/**
	 * Create a detached, initialised InnodbFtIndexCacheRecord
	 */
	public InnodbFtIndexCacheRecord(String word, ULong firstDocId, ULong lastDocId, ULong docCount, ULong docId, ULong position) {
		super(InnodbFtIndexCache.INNODB_FT_INDEX_CACHE);

		setValue(0, word);
		setValue(1, firstDocId);
		setValue(2, lastDocId);
		setValue(3, docCount);
		setValue(4, docId);
		setValue(5, position);
	}
}
