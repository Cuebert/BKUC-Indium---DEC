.class Lo8/a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo8/a$b;->k(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Ljava/util/List;

.field final synthetic o:Lo8/a$b;


# direct methods
.method constructor <init>(Lo8/a$b;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lo8/a$b$a;->o:Lo8/a$b;

    iput-object p2, p0, Lo8/a$b$a;->n:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lo8/a$b$a;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo8/d;

    .line 2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Trying to post event: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lo8/d;->a()Lo8/c;

    move-result-object v3

    invoke-virtual {v3}, Lo8/c;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "AppRouter"

    invoke-static {v3, v2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-virtual {v1}, Lo8/d;->a()Lo8/c;

    move-result-object v2

    invoke-virtual {v2}, Lo8/c;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, La7/i;->b(Ljava/lang/String;)La7/i;

    move-result-object v2

    .line 4
    sget-object v3, Lo8/a$a;->a:[I

    invoke-virtual {v1}, Lo8/d;->a()Lo8/c;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq v3, v4, :cond_2

    const/4 v4, 0x2

    if-eq v3, v4, :cond_0

    const/4 v1, 0x0

    goto/16 :goto_1

    .line 5
    :cond_0
    invoke-virtual {v1}, Lo8/d;->a()Lo8/c;

    move-result-object v3

    invoke-virtual {v3}, Lo8/c;->d()[Ljava/lang/String;

    move-result-object v3

    aget-object v3, v3, v5

    .line 6
    invoke-virtual {v1}, Lo8/d;->b()Ljava/util/HashMap;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 7
    iget-object v0, p0, Lo8/a$b$a;->o:Lo8/a$b;

    invoke-static {v0}, Lo8/a$b;->b(Lo8/a$b;)Lo8/b;

    move-result-object v0

    invoke-virtual {v1}, Lo8/d;->a()Lo8/c;

    move-result-object v1

    invoke-virtual {v1}, Lo8/c;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo8/a$b$a;->o:Lo8/a$b;

    invoke-static {v2}, Lo8/a$b;->a(Lo8/a$b;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo8/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 8
    :cond_1
    :try_start_0
    invoke-virtual {v1}, Lo8/d;->b()Ljava/util/HashMap;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 10
    :catch_0
    iget-object v0, p0, Lo8/a$b$a;->o:Lo8/a$b;

    invoke-static {v0}, Lo8/a$b;->b(Lo8/a$b;)Lo8/b;

    move-result-object v0

    invoke-virtual {v1}, Lo8/d;->a()Lo8/c;

    move-result-object v1

    invoke-virtual {v1}, Lo8/c;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo8/a$b$a;->o:Lo8/a$b;

    invoke-static {v2}, Lo8/a$b;->a(Lo8/a$b;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo8/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 11
    :cond_2
    invoke-virtual {v1}, Lo8/d;->a()Lo8/c;

    move-result-object v3

    invoke-virtual {v3}, Lo8/c;->d()[Ljava/lang/String;

    move-result-object v3

    aget-object v3, v3, v5

    .line 12
    invoke-virtual {v1}, Lo8/d;->b()Ljava/util/HashMap;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 13
    iget-object v0, p0, Lo8/a$b$a;->o:Lo8/a$b;

    invoke-static {v0}, Lo8/a$b;->b(Lo8/a$b;)Lo8/b;

    move-result-object v0

    invoke-virtual {v1}, Lo8/d;->a()Lo8/c;

    move-result-object v1

    invoke-virtual {v1}, Lo8/c;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo8/a$b$a;->o:Lo8/a$b;

    invoke-static {v2}, Lo8/a$b;->a(Lo8/a$b;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo8/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 14
    :cond_3
    :try_start_1
    invoke-virtual {v1}, Lo8/d;->b()Ljava/util/HashMap;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 15
    invoke-static {v3, v4}, La7/i;->c(J)Ljava/lang/String;

    move-result-object v1

    :goto_1
    if-eqz v1, :cond_4

    .line 16
    invoke-virtual {v2, v1}, La7/i;->i(Ljava/lang/String;)V

    .line 17
    iget-object v1, p0, Lo8/a$b$a;->o:Lo8/a$b;

    invoke-static {v1}, Lo8/a$b;->b(Lo8/a$b;)Lo8/b;

    move-result-object v1

    invoke-virtual {v1}, Lo8/b;->i()V

    goto :goto_2

    .line 18
    :cond_4
    iget-object v1, p0, Lo8/a$b$a;->o:Lo8/a$b;

    invoke-static {v1}, Lo8/a$b;->b(Lo8/a$b;)Lo8/b;

    move-result-object v1

    invoke-virtual {v1}, Lo8/b;->j()V

    .line 19
    :goto_2
    iget-object v1, p0, Lo8/a$b$a;->o:Lo8/a$b;

    invoke-static {v1}, Lo8/a$b;->c(Lo8/a$b;)Lbc/c;

    move-result-object v1

    invoke-virtual {v1, v2}, Lbc/c;->j(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 20
    :catch_1
    iget-object v0, p0, Lo8/a$b$a;->o:Lo8/a$b;

    invoke-static {v0}, Lo8/a$b;->b(Lo8/a$b;)Lo8/b;

    move-result-object v0

    invoke-virtual {v1}, Lo8/d;->a()Lo8/c;

    move-result-object v1

    invoke-virtual {v1}, Lo8/c;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo8/a$b$a;->o:Lo8/a$b;

    invoke-static {v2}, Lo8/a$b;->a(Lo8/a$b;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo8/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    return-void
.end method
