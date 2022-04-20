package kz.oceandance.superapp.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.ui.setupWithNavController
import kz.oceandance.common.base.BaseFragment
import kz.oceandance.common.ext.setupWithNavController
import kz.oceandance.superapp.main.databinding.FragmentMainBinding

class MainFragment : BaseFragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (savedInstanceState == null) setupBottomNavigationBar()
    }

    private fun setupBottomNavigationBar() {
        val navControllerLiveData = binding.bottomNavigationView.setupWithNavController(
            fragmentManager = childFragmentManager,
            containerId = R.id.main_navigation_container,
            intent = requireActivity().intent,
            navGraphIds = listOf(
                R.navigation.home_nav_graph,
                R.navigation.news_nav_graph
            )
        )

        navControllerLiveData.observe(viewLifecycleOwner) { navController ->
            binding.toolbar.setupWithNavController(navController)
        }

    }

}