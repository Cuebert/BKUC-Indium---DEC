.class public Lcom/roblox/client/provider/ShellConfigurationContentProvider;
.super Landroid/content/ContentProvider;
.source "SourceFile"


# instance fields
.field private final n:Ljava/lang/String;

.field private o:Landroid/content/UriMatcher;

.field private p:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ld8/f;",
            ">;"
        }
    .end annotation
.end field

.field private q:Lu6/c;

.field private r:Lu6/c$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    const-string v0, "rbx.config"

    .line 2
    iput-object v0, p0, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->n:Ljava/lang/String;

    .line 3
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->p:Landroid/util/SparseArray;

    return-void
.end method

.method private a()Z
    .locals 3

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->x()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    .line 2
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getCallingPackage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v2, "com.roblox.client"

    .line 3
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "com.tencent.roblox"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return v1

    :cond_1
    const/4 v0, 0x0

    return v0

    :cond_2
    return v1
.end method

.method private e(Ljava/lang/String;Ld8/f;)V
    .locals 1

    .line 1
    sget-object v0, Ld8/f$a;->n:Ld8/f$a;

    invoke-interface {p2, v0}, Ld8/f;->c(Ld8/f$a;)Lu6/a;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->f(Ljava/lang/String;Ld8/f;Lu6/a;)V

    .line 2
    sget-object v0, Ld8/f$a;->o:Ld8/f$a;

    invoke-interface {p2, v0}, Ld8/f;->c(Ld8/f$a;)Lu6/a;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->f(Ljava/lang/String;Ld8/f;Lu6/a;)V

    return-void
.end method

.method private f(Ljava/lang/String;Ld8/f;Lu6/a;)V
    .locals 3

    if-eqz p3, :cond_0

    .line 1
    iget-object v0, p0, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->o:Landroid/content/UriMatcher;

    iget-object v1, p3, Lu6/a;->n:Ljava/lang/String;

    iget v2, p3, Lu6/a;->o:I

    invoke-virtual {v0, p1, v1, v2}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 2
    iget-object p1, p0, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->p:Landroid/util/SparseArray;

    iget p3, p3, Lu6/a;->o:I

    invoke-virtual {p1, p3, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private g()V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/UriMatcher;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Landroid/content/UriMatcher;-><init>(I)V

    iput-object v0, p0, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->o:Landroid/content/UriMatcher;

    .line 2
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 3
    new-instance v1, Ld8/e;

    invoke-direct {v1}, Ld8/e;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->e(Ljava/lang/String;Ld8/f;)V

    .line 4
    new-instance v1, Ld8/c;

    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Ld8/c;-><init>(Lcom/roblox/client/provider/ShellConfigurationContentProvider;Landroid/content/Context;)V

    invoke-direct {p0, v0, v1}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->e(Ljava/lang/String;Ld8/f;)V

    .line 5
    new-instance v1, Ld8/g;

    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Ld8/g;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0, v1}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->e(Ljava/lang/String;Ld8/f;)V

    .line 6
    new-instance v1, Ld8/d;

    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Ld8/d;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0, v1}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->e(Ljava/lang/String;Ld8/f;)V

    return-void
.end method


# virtual methods
.method public b(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v1, Lcom/roblox/client/c0;->C4:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public c()Lu6/c$a;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->r:Lu6/c$a;

    return-object v0
.end method

.method public d()Lu6/c;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->q:Lu6/c;

    return-object v0
.end method

.method public delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->a()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->o:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v0

    .line 3
    iget-object v1, p0, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->p:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld8/f;

    if-eqz v0, :cond_1

    .line 4
    invoke-interface {v0, p1, p2}, Ld8/f;->b(Landroid/net/Uri;Landroid/content/ContentValues;)V

    :cond_1
    return-object p1
.end method

.method public onCreate()Z
    .locals 2

    .line 1
    invoke-static {}, Lc7/f;->c()Lc7/f;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/roblox/client/p0;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-virtual {v0, v1}, Lc7/f;->d(Landroid/content/SharedPreferences;)V

    .line 2
    invoke-direct {p0}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->g()V

    .line 3
    new-instance v0, Lc8/c;

    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lc8/c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->r:Lu6/c$a;

    .line 4
    invoke-interface {v0}, Lu6/c$a;->d()Lu6/c;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->q:Lu6/c;

    const/4 v0, 0x1

    return v0
.end method

.method public query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->a()Z

    move-result p2

    const/4 p3, 0x0

    if-nez p2, :cond_0

    return-object p3

    .line 2
    :cond_0
    iget-object p2, p0, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->o:Landroid/content/UriMatcher;

    invoke-virtual {p2, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result p2

    .line 3
    iget-object p4, p0, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->p:Landroid/util/SparseArray;

    invoke-virtual {p4, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ld8/f;

    if-eqz p2, :cond_1

    .line 4
    invoke-interface {p2, p1}, Ld8/f;->a(Landroid/net/Uri;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1

    :cond_1
    return-object p3
.end method

.method public update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
