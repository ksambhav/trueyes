/**
 * 
 */
package com.samsoft.trueyes.core.api;

import java.util.Collection;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author kumar
 *
 */

public interface CRUDService<T> {

	/**
	 * Find by ID.
	 * 
	 * @param id
	 * @return
	 */
	T find(String id);

	/**
	 * 
	 * @return
	 */
	Collection<T> list();

	T save(T t);

	/**
	 * 
	 * @param pageRequest
	 * @return
	 */
	Page<T> find(Pageable pageRequest);

	boolean delete(String id);
}
