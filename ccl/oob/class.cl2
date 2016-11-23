def class(methods, fields, constructor){
    def impl(methods, fields, constructor){
        //Empty object
        var ret = [];
        
        def setBase(holder, dex, name, value){
            holder.set(dex * 2, value);
            holder.setProperty(name, value);
        }
        
        //Init fields
        {
            var i = 0;
            while(i < fields.length()){
                var name = fields[i];
                ret.push(undefined._, name);
                ret.push(setBase.bind(
                    ret,
                    i._,
                    name._
                ), "set_".concat(name._));
                i = i + 1;
            }
        }
        
        //Init methods
        {
            var i = 0;
            while(i < methods.length()){
                ret.push(methods[i].0.bind(ret), methods[i].1);
                i = i + 1;
            }
        }
        
        //Call constructor
        {
            var i = 3;
            var c = constructor.bind(ret);
            while(i < parameters.length()){
                c = c.bind(parameters.get(i));
                i = i + 1;
            }
            c();
        }
        
        return ret;
    }
    
    return impl.bind(methods._, fields._, constructor._);
}