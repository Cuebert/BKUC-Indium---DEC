.class final Lb5/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ld5/x;

.field private final b:Ljava/lang/String;

.field private final c:Lg4/m;

.field final d:Ld5/d;


# direct methods
.method constructor <init>(Landroid/content/Context;Ld5/x;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lg4/m;

    invoke-direct {v0}, Lg4/m;-><init>()V

    iput-object v0, p0, Lb5/t;->c:Lg4/m;

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lb5/t;->b:Ljava/lang/String;

    iput-object p2, p0, Lb5/t;->a:Ld5/x;

    .line 3
    new-instance v1, Ld5/d;

    sget-object v6, Lb5/u;->a:Landroid/content/Intent;

    sget-object v7, Lb5/l;->a:Lb5/l;

    const-string v5, "ExpressIntegrityService"

    const/4 v8, 0x0

    move-object v2, v1

    move-object v3, p1

    move-object v4, p2

    .line 4
    invoke-direct/range {v2 .. v8}, Ld5/d;-><init>(Landroid/content/Context;Ld5/x;Ljava/lang/String;Landroid/content/Intent;Ld5/e0;Ld5/d0;)V

    iput-object v1, p0, Lb5/t;->d:Ld5/d;

    new-instance p2, Lb5/m;

    invoke-direct {p2, p0, v0, p1}, Lb5/m;-><init>(Lb5/t;Lg4/m;Landroid/content/Context;)V

    .line 5
    invoke-virtual {v1}, Ld5/d;->c()Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method static bridge synthetic a(Lb5/t;Ljava/lang/String;JJ)Landroid/os/Bundle;
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object p0, p0, Lb5/t;->b:Ljava/lang/String;

    const-string v1, "package.name"

    .line 2
    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "cloud.prj"

    .line 3
    invoke-virtual {v0, p0, p2, p3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string p0, "nonce"

    .line 4
    invoke-virtual {v0, p0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "warm.up.sid"

    .line 5
    invoke-virtual {v0, p0, p4, p5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    new-instance p0, Ljava/util/ArrayList;

    .line 6
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    const/4 p1, 0x5

    .line 7
    invoke-static {p1, p0}, Ld5/p;->b(ILjava/util/List;)V

    new-instance p1, Ljava/util/ArrayList;

    .line 8
    invoke-static {p0}, Ld5/p;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string p0, "event_timestamps"

    .line 9
    invoke-virtual {v0, p0, p1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object v0
.end method

.method static bridge synthetic b(Lb5/t;J)Landroid/os/Bundle;
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object p0, p0, Lb5/t;->b:Ljava/lang/String;

    const-string v1, "package.name"

    .line 2
    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "cloud.prj"

    .line 3
    invoke-virtual {v0, p0, p1, p2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    new-instance p0, Ljava/util/ArrayList;

    .line 4
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    const/4 p1, 0x4

    .line 5
    invoke-static {p1, p0}, Ld5/p;->b(ILjava/util/List;)V

    new-instance p1, Ljava/util/ArrayList;

    .line 6
    invoke-static {p0}, Ld5/p;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string p0, "event_timestamps"

    .line 7
    invoke-virtual {v0, p0, p1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object v0
.end method

.method static bridge synthetic e(Lb5/t;)Lg4/m;
    .locals 0

    iget-object p0, p0, Lb5/t;->c:Lg4/m;

    return-object p0
.end method

.method static bridge synthetic f(Lb5/t;)Ld5/x;
    .locals 0

    iget-object p0, p0, Lb5/t;->a:Ld5/x;

    return-object p0
.end method

.method static bridge synthetic g(Lb5/t;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/t;->c:Lg4/m;

    invoke-virtual {v0}, Lg4/m;->a()Lg4/l;

    move-result-object v0

    invoke-virtual {v0}, Lg4/l;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lb5/t;->c:Lg4/m;

    .line 2
    invoke-virtual {p0}, Lg4/m;->a()Lg4/l;

    move-result-object p0

    invoke-virtual {p0}, Lg4/l;->k()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final c(Ljava/lang/String;JJ)Lg4/l;
    .locals 13

    move-object v9, p0

    .line 1
    iget-object v0, v9, Lb5/t;->a:Ld5/x;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static/range {p4 .. p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "requestExpressIntegrityToken(%s)"

    invoke-virtual {v0, v2, v1}, Ld5/x;->b(Ljava/lang/String;[Ljava/lang/Object;)I

    .line 2
    new-instance v10, Lg4/m;

    invoke-direct {v10}, Lg4/m;-><init>()V

    iget-object v11, v9, Lb5/t;->d:Ld5/d;

    new-instance v12, Lb5/o;

    move-object v0, v12

    move-object v1, p0

    move-object v2, v10

    move-object v3, p1

    move-wide v4, p2

    move-wide/from16 v6, p4

    move-object v8, v10

    invoke-direct/range {v0 .. v8}, Lb5/o;-><init>(Lb5/t;Lg4/m;Ljava/lang/String;JJLg4/m;)V

    .line 3
    invoke-virtual {v11, v12, v10}, Ld5/d;->t(Ld5/y;Lg4/m;)V

    .line 4
    invoke-virtual {v10}, Lg4/m;->a()Lg4/l;

    move-result-object v0

    return-object v0
.end method

.method public final d(J)Lg4/l;
    .locals 9

    .line 1
    iget-object v0, p0, Lb5/t;->a:Ld5/x;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "warmUpIntegrityToken(%s)"

    invoke-virtual {v0, v2, v1}, Ld5/x;->b(Ljava/lang/String;[Ljava/lang/Object;)I

    .line 2
    new-instance v0, Lg4/m;

    invoke-direct {v0}, Lg4/m;-><init>()V

    iget-object v1, p0, Lb5/t;->d:Ld5/d;

    new-instance v2, Lb5/n;

    move-object v3, v2

    move-object v4, p0

    move-object v5, v0

    move-wide v6, p1

    move-object v8, v0

    invoke-direct/range {v3 .. v8}, Lb5/n;-><init>(Lb5/t;Lg4/m;JLg4/m;)V

    .line 3
    invoke-virtual {v1, v2, v0}, Ld5/d;->t(Ld5/y;Lg4/m;)V

    .line 4
    invoke-virtual {v0}, Lg4/m;->a()Lg4/l;

    move-result-object p1

    return-object p1
.end method
