package net.antoniy.gidder.beta.git;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.errors.RepositoryNotFoundException;

public interface GitRepositoryManager {

	Git openRepository(String mapping) throws RepositoryNotFoundException;

	Git createRepository(String mapping) throws RepositoryNotFoundException;

	void renameRepository(String oldMapping, String newMapping) throws RepositoryNotFoundException;

	void deleteRepository(String mapping) throws RepositoryNotFoundException;

}
