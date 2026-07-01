package com.joaomarcos.rotinaplusv2.ui.login

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.joaomarcos.rotinaplusv2.R

class LoginFragment: Fragment(R.layout.fragment_login) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Views
        val emailLogin: EditText = view.findViewById(R.id.email_login);
        val passwordLogin: EditText = view.findViewById(R.id.password_login);

        val btnLogin: Button = view.findViewById(R.id.btn_login);

        val anchorRegistryLogin: TextView = view.findViewById(R.id.anchor_registry_login);
        val anchorCompanieRegistryLogin: TextView = view.findViewById(R.id.anchor_companie_registry_login);

        //Funções
        anchorRegistryLogin.setOnClickListener { setRegistryListener() }
    }

    fun setRegistryListener() {
        parentFragmentManager.beginTransaction()
            .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
            .replace(R.id.fragment_container, RegistryFragment())
            .commit()
    }
}