import Dashboard from 'pages/Dashboard'
import Home from 'pages/Home'
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'

const Routes = () => {
    return (
        <Router>
            <Switch>
                <Route exact path="/" component={Home} />
                <Route exact path="/dashboard" component={Dashboard} />
            </Switch>
        </Router>
    )
}

export default Routes