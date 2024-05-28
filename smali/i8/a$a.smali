.class Li8/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgc/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li8/a;->c(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;Lh8/m$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lgc/d<",
        "Lob/j0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lh8/m$b;

.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Li8/a;


# direct methods
.method constructor <init>(Li8/a;Lh8/m$b;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Li8/a$a;->c:Li8/a;

    iput-object p2, p0, Li8/a$a;->a:Lh8/m$b;

    iput-object p3, p0, Li8/a$a;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgc/b;Lgc/t;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc/b<",
            "Lob/j0;",
            ">;",
            "Lgc/t<",
            "Lob/j0;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lgc/t;->b()I

    move-result p1

    const-string v0, "PushNotificationRegistrationFailed"

    const/16 v1, 0xc8

    if-ne p1, v1, :cond_0

    .line 2
    :try_start_0
    invoke-static {p2}, Lc9/o;->a(Lgc/t;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "rbx.push"

    .line 3
    invoke-static {p2, p1}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    iget-object p2, p0, Li8/a$a;->c:Li8/a;

    iget-object v1, p0, Li8/a$a;->a:Lh8/m$b;

    new-instance v2, Lj8/n;

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3}, Lj8/n;-><init>(Lorg/json/JSONObject;)V

    iget-object p1, p0, Li8/a$a;->b:Landroid/content/Context;

    invoke-virtual {p2, v1, v2, p1}, Li8/a;->d(Lh8/m$b;Lj8/n;Landroid/content/Context;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 5
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    .line 6
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object p1

    new-instance p2, La7/k;

    invoke-direct {p2, v0}, La7/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lbc/c;->j(Ljava/lang/Object;)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object p1

    new-instance p2, La7/k;

    invoke-direct {p2, v0}, La7/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lbc/c;->j(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public b(Lgc/b;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc/b<",
            "Lob/j0;",
            ">;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object p1

    new-instance p2, La7/k;

    const-string v0, "PushNotificationRegistrationFailed"

    invoke-direct {p2, v0}, La7/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lbc/c;->j(Ljava/lang/Object;)V

    return-void
.end method
