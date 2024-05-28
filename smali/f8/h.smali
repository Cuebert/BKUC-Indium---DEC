.class public Lf8/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le8/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf8/h$n;,
        Lf8/h$o;,
        Lf8/h$p;,
        Lf8/h$m;
    }
.end annotation


# static fields
.field private static A:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static B:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static C:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static y:Lf8/h;

.field private static z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Lf8/i;

.field private b:Lf8/h$m;

.field private c:Lf8/h$m;

.field private d:Lf8/h$m;

.field private e:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Lcom/android/billingclient/api/g;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Lcom/android/billingclient/api/g;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Lcom/android/billingclient/api/Purchase;",
            ">;"
        }
    .end annotation
.end field

.field private h:Z

.field private i:Landroid/app/Activity;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Z

.field private n:J

.field private o:Z

.field private p:Lx7/e;

.field private q:Lh7/f;

.field private r:Le8/g;

.field private final s:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private t:Ljava/lang/String;

.field private u:Le8/e$d;

.field public v:Ln1/j;

.field public w:Ln1/h;

.field public x:Ln1/h;


# direct methods
.method static constructor <clinit>()V
    .locals 20

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    const-string v1, "com.roblox.client.robux40"

    const-string v2, "com.roblox.robloxmobile.premium80robux"

    const-string v3, "com.roblox.robloxmobile.premium160robux"

    const-string v4, "com.roblox.robloxmobile.premium240robux"

    const-string v5, "com.roblox.robloxmobile.premium320robux"

    const-string v6, "com.roblox.robloxmobile.premium400robux"

    const-string v7, "com.roblox.robloxmobile.premium800robux"

    const-string v8, "com.roblox.robloxmobile.premium1700robux"

    const-string v9, "com.roblox.robloxmobile.premium4500robux"

    const-string v10, "com.roblox.robloxmobile.premium10000robux"

    const-string v11, "com.roblox.robloxmobile.premium88subscribed"

    const-string v12, "com.roblox.robloxmobile.premium175subscribed"

    const-string v13, "com.roblox.robloxmobile.premium265subscribed"

    const-string v14, "com.roblox.robloxmobile.premium350subscribed"

    const-string v15, "com.roblox.robloxmobile.premium440subscribed2"

    const-string v16, "com.roblox.robloxmobile.premium880subscribed"

    const-string v17, "com.roblox.robloxmobile.premium1870subscribed"

    const-string v18, "com.roblox.robloxmobile.premium4950subscribed"

    const-string v19, "com.roblox.robloxmobile.premium11000subscribed"

    filled-new-array/range {v1 .. v19}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lf8/h;->z:Ljava/util/List;

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    const-string v1, "com.roblox.robloxmobile.robloxpremium450"

    const-string v2, "com.roblox.robloxmobile.robloxpremium1000"

    const-string v3, "com.roblox.robloxmobile.robloxpremium2200"

    filled-new-array {v1, v2, v3}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lf8/h;->B:Ljava/util/List;

    return-void
.end method

.method constructor <init>(Lf8/i;Lh7/f;Lx7/e;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lf8/h$m;->n:Lf8/h$m;

    iput-object v0, p0, Lf8/h;->b:Lf8/h$m;

    .line 3
    iput-object v0, p0, Lf8/h;->c:Lf8/h$m;

    .line 4
    iput-object v0, p0, Lf8/h;->d:Lf8/h$m;

    .line 5
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lf8/h;->e:Ljava/util/Hashtable;

    .line 6
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lf8/h;->f:Ljava/util/Hashtable;

    .line 7
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lf8/h;->g:Ljava/util/Hashtable;

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lf8/h;->h:Z

    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lf8/h;->j:Ljava/lang/String;

    .line 10
    iput-object v0, p0, Lf8/h;->k:Ljava/lang/String;

    const-string v0, ""

    .line 11
    iput-object v0, p0, Lf8/h;->l:Ljava/lang/String;

    const-wide/16 v0, 0x0

    .line 12
    iput-wide v0, p0, Lf8/h;->n:J

    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lf8/h;->o:Z

    .line 14
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lf8/h;->s:Ljava/util/Hashtable;

    .line 15
    new-instance v0, Lf8/h$h;

    invoke-direct {v0, p0}, Lf8/h$h;-><init>(Lf8/h;)V

    iput-object v0, p0, Lf8/h;->u:Le8/e$d;

    .line 16
    new-instance v0, Lf8/h$i;

    invoke-direct {v0, p0}, Lf8/h$i;-><init>(Lf8/h;)V

    iput-object v0, p0, Lf8/h;->v:Ln1/j;

    .line 17
    new-instance v0, Lf8/h$a;

    invoke-direct {v0, p0}, Lf8/h$a;-><init>(Lf8/h;)V

    iput-object v0, p0, Lf8/h;->w:Ln1/h;

    .line 18
    new-instance v0, Lf8/h$b;

    invoke-direct {v0, p0}, Lf8/h$b;-><init>(Lf8/h;)V

    iput-object v0, p0, Lf8/h;->x:Ln1/h;

    .line 19
    iput-object p1, p0, Lf8/h;->a:Lf8/i;

    .line 20
    iput-object p2, p0, Lf8/h;->q:Lh7/f;

    .line 21
    iput-object p3, p0, Lf8/h;->p:Lx7/e;

    return-void
.end method

.method static synthetic A(Lf8/h;)V
    .locals 0

    invoke-direct {p0}, Lf8/h;->d1()V

    return-void
.end method

.method private A0(Ljava/lang/String;Lcom/android/billingclient/api/g;Z)Z
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, p3, v0}, Lf8/h;->B0(Ljava/lang/String;Lcom/android/billingclient/api/g;ZZ)Z

    move-result p1

    return p1
.end method

.method static synthetic B(Lf8/h;Lcom/android/billingclient/api/Purchase;)Z
    .locals 0

    invoke-direct {p0, p1}, Lf8/h;->y0(Lcom/android/billingclient/api/Purchase;)Z

    move-result p0

    return p0
.end method

.method private B0(Ljava/lang/String;Lcom/android/billingclient/api/g;ZZ)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p2, :cond_1

    const-string p2, "rbx.purchaseflow"

    const-string p3, "Product details not found after query."

    .line 1
    invoke-static {p2, p3}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p4, :cond_0

    .line 2
    sget-object p2, Lf8/d$b;->I:Lf8/d$b;

    const-string p3, "Product details not found"

    invoke-direct {p0, p1, p2, p3}, Lf8/h;->H0(Ljava/lang/String;Lf8/d$b;Ljava/lang/String;)V

    :cond_0
    return v0

    :cond_1
    const-string p1, "Product subscription offer details not found"

    if-eqz p3, :cond_3

    .line 3
    invoke-virtual {p2}, Lcom/android/billingclient/api/g;->d()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_3

    if-eqz p4, :cond_2

    .line 4
    iget-object p2, p0, Lf8/h;->j:Ljava/lang/String;

    sget-object p3, Lf8/d$b;->I:Lf8/d$b;

    invoke-direct {p0, p2, p3, p1}, Lf8/h;->H0(Ljava/lang/String;Lf8/d$b;Ljava/lang/String;)V

    :cond_2
    return v0

    :cond_3
    if-nez p3, :cond_5

    .line 5
    invoke-virtual {p2}, Lcom/android/billingclient/api/g;->a()Lcom/android/billingclient/api/g$a;

    move-result-object p2

    if-nez p2, :cond_5

    if-eqz p4, :cond_4

    .line 6
    iget-object p2, p0, Lf8/h;->j:Ljava/lang/String;

    sget-object p3, Lf8/d$b;->I:Lf8/d$b;

    invoke-direct {p0, p2, p3, p1}, Lf8/h;->H0(Ljava/lang/String;Lf8/d$b;Ljava/lang/String;)V

    :cond_4
    return v0

    :cond_5
    const/4 p1, 0x1

    return p1
.end method

.method static synthetic C(Lf8/h;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, Lf8/h;->u0(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private synthetic C0(Ljava/util/Map;ZLjava/util/List;)V
    .locals 4

    if-eqz p3, :cond_3

    .line 1
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/g;

    const-string v1, "rbx.purchaseflow"

    if-nez v0, :cond_1

    const-string v0, "Null product details in list"

    .line 3
    invoke-static {v1, v0}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {v0}, Lcom/android/billingclient/api/g;->b()Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot find purchase associated with product details. ProductId: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 7
    :cond_2
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/Purchase;

    .line 8
    invoke-direct {p0, v0, p2}, Lf8/h;->p0(Lcom/android/billingclient/api/Purchase;Z)V

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method static synthetic D(Lf8/h;Ljava/lang/String;Lf8/d$b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lf8/h;->G0(Ljava/lang/String;Lf8/d$b;)V

    return-void
.end method

.method private synthetic D0(Ljava/util/List;Lf8/h$o;Lcom/android/billingclient/api/f;Ljava/util/List;)V
    .locals 4

    .line 1
    invoke-virtual {p3}, Lcom/android/billingclient/api/f;->b()I

    move-result v0

    const-string v1, "QueryProductDetailsAsync"

    .line 2
    invoke-direct {p0, v1, v0}, Lf8/h;->P0(Ljava/lang/String;I)V

    const-string v1, "rbx.purchaseflow"

    if-nez v0, :cond_3

    .line 3
    invoke-interface {p4}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 4
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Returned no ProductDetails for Products: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 5
    :cond_0
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/g;

    .line 6
    invoke-virtual {v0}, Lcom/android/billingclient/api/g;->c()Ljava/lang/String;

    move-result-object v2

    const-string v3, "subs"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 7
    iget-object v2, p0, Lf8/h;->f:Ljava/util/Hashtable;

    invoke-virtual {v0}, Lcom/android/billingclient/api/g;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 8
    :cond_1
    iget-object v2, p0, Lf8/h;->e:Ljava/util/Hashtable;

    invoke-virtual {v0}, Lcom/android/billingclient/api/g;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 9
    :cond_2
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "queryProductDetails Success. Products: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 10
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed queryProductDetails. Products: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", BillingResult: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    :goto_1
    invoke-interface {p2, p4}, Lf8/h$o;->a(Ljava/util/List;)V

    return-void
.end method

.method static synthetic E(Lf8/h;Ljava/lang/String;Lcom/android/billingclient/api/g;ZZ)Z
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lf8/h;->B0(Ljava/lang/String;Lcom/android/billingclient/api/g;ZZ)Z

    move-result p0

    return p0
.end method

.method private synthetic E0(Lf8/b;ZLjava/util/List;)V
    .locals 2

    if-eqz p3, :cond_2

    .line 1
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/android/billingclient/api/g;

    .line 3
    invoke-virtual {p1}, Lf8/b;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lf8/b;->c()Z

    move-result v1

    invoke-direct {p0, v0, p3, v1}, Lf8/h;->A0(Ljava/lang/String;Lcom/android/billingclient/api/g;Z)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 4
    :cond_1
    invoke-virtual {p1}, Lf8/b;->c()Z

    move-result v0

    invoke-direct {p0, p3, v0}, Lf8/h;->l0(Lcom/android/billingclient/api/g;Z)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lf8/h;->k:Ljava/lang/String;

    .line 5
    iget-object p3, p0, Lf8/h;->p:Lx7/e;

    new-instance v0, Le8/f;

    iget-object v1, p0, Lf8/h;->l:Ljava/lang/String;

    invoke-virtual {p1}, Lf8/b;->d()Ljava/lang/String;

    move-result-object p1

    xor-int/lit8 p2, p2, 0x1

    invoke-direct {v0, v1, p1, p2}, Le8/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {p3, v0}, Lx7/e;->k0(Le8/f;)V

    .line 6
    invoke-direct {p0}, Lf8/h;->e0()V

    return-void

    .line 7
    :cond_2
    :goto_0
    invoke-virtual {p1}, Lf8/b;->d()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lf8/d$b;->I:Lf8/d$b;

    const-string p3, "Product details not found"

    invoke-direct {p0, p1, p2, p3}, Lf8/h;->H0(Ljava/lang/String;Lf8/d$b;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic F(Lf8/h;Lf8/h$m;)Lf8/h$m;
    .locals 0

    iput-object p1, p0, Lf8/h;->c:Lf8/h$m;

    return-object p1
.end method

.method private F0(Lcom/android/billingclient/api/Purchase;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lf8/h;->r:Le8/g;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lf8/h;->g(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lf8/h;->z0(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lf8/h;->r:Le8/g;

    invoke-interface {v0}, Le8/g;->b()V

    .line 3
    :cond_0
    invoke-static {}, Lcom/roblox/client/p0;->e1()Ljava/lang/String;

    move-result-object v0

    .line 4
    new-instance v1, Lf8/c;

    invoke-virtual {p0}, Lf8/h;->s0()Z

    move-result v2

    invoke-direct {v1, p1, p2, v2}, Lf8/c;-><init>(Lcom/android/billingclient/api/Purchase;ZZ)V

    .line 5
    new-instance p2, Le8/j;

    iget-object v2, p0, Lf8/h;->q:Lh7/f;

    invoke-direct {p2, v2}, Le8/j;-><init>(Lh7/f;)V

    .line 6
    new-instance v2, Lf8/h$j;

    invoke-direct {v2, p0, p1}, Lf8/h$j;-><init>(Lf8/h;Lcom/android/billingclient/api/Purchase;)V

    invoke-virtual {p2, v0, v1, v2}, Le8/j;->b(Ljava/lang/String;Li7/c;Le8/j$c;)V

    return-void
.end method

.method static synthetic G(Lf8/h;Lcom/android/billingclient/api/Purchase;)V
    .locals 0

    invoke-direct {p0, p1}, Lf8/h;->W(Lcom/android/billingclient/api/Purchase;)V

    return-void
.end method

.method private G0(Ljava/lang/String;Lf8/d$b;)V
    .locals 6

    .line 1
    sget-object v0, Lf8/d$b;->n:Lf8/d$b;

    if-ne p2, v0, :cond_0

    .line 2
    invoke-direct {p0}, Lf8/h;->c1()V

    goto :goto_0

    .line 3
    :cond_0
    sget-object v1, Lf8/d$b;->w:Lf8/d$b;

    if-ne p2, v1, :cond_1

    .line 4
    invoke-direct {p0}, Lf8/h;->a1()V

    goto :goto_0

    .line 5
    :cond_1
    sget-object v1, Lf8/d$b;->x:Lf8/d$b;

    if-ne p2, v1, :cond_2

    .line 6
    invoke-direct {p0}, Lf8/h;->Z0()V

    goto :goto_0

    .line 7
    :cond_2
    invoke-direct {p0}, Lf8/h;->b1()V

    .line 8
    :goto_0
    iget-object v1, p0, Lf8/h;->r:Le8/g;

    if-eqz v1, :cond_8

    invoke-direct {p0, p1}, Lf8/h;->z0(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 9
    iget-object v1, p0, Lf8/h;->r:Le8/g;

    instance-of v2, v1, Lf7/e0;

    if-eqz v2, :cond_7

    .line 10
    iget-wide v1, p0, Lf8/h;->n:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-eqz v5, :cond_6

    .line 11
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->t1()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    iget-object v1, p0, Lf8/h;->s:Ljava/util/Hashtable;

    invoke-virtual {v1, p1}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 12
    iget-object v1, p0, Lf8/h;->r:Le8/g;

    check-cast v1, Lf7/e0;

    if-ne p2, v0, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    iget-wide v3, p0, Lf8/h;->n:J

    iget-object p2, p0, Lf8/h;->s:Ljava/util/Hashtable;

    invoke-virtual {p2, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-interface {v1, v2, v3, v4, p1}, Lf7/e0;->a(ZJLjava/lang/String;)V

    return-void

    .line 13
    :cond_4
    iget-object v1, p0, Lf8/h;->r:Le8/g;

    check-cast v1, Lf7/e0;

    if-ne p2, v0, :cond_5

    goto :goto_2

    :cond_5
    const/4 v2, 0x0

    :goto_2
    iget-wide v3, p0, Lf8/h;->n:J

    iget-object p2, p0, Lf8/h;->j:Ljava/lang/String;

    invoke-interface {v1, v2, v3, v4, p2}, Lf7/e0;->a(ZJLjava/lang/String;)V

    goto :goto_3

    .line 14
    :cond_6
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Ignore calling inGamePurchaseFinished: mUserId="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Lf8/h;->n:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ". mProductId="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lf8/h;->j:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "rbx.purchaseflow"

    invoke-static {v0, p2}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :cond_7
    if-eqz v1, :cond_8

    .line 15
    new-instance v0, Lf8/d;

    iget-object v2, p0, Lf8/h;->j:Ljava/lang/String;

    invoke-direct {v0, p2, v2}, Lf8/d;-><init>(Lf8/d$b;Ljava/lang/String;)V

    invoke-interface {v1, v0}, Le8/g;->c(Le8/h;)V

    .line 16
    :cond_8
    :goto_3
    invoke-direct {p0, p1}, Lf8/h;->z0(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 17
    invoke-direct {p0}, Lf8/h;->N0()V

    :cond_9
    return-void
.end method

.method static synthetic H(Lf8/h;)V
    .locals 0

    invoke-direct {p0}, Lf8/h;->g1()V

    return-void
.end method

.method private H0(Ljava/lang/String;Lf8/d$b;Ljava/lang/String;)V
    .locals 1

    if-eqz p3, :cond_0

    .line 1
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    iget-object v0, p0, Lf8/h;->p:Lx7/e;

    invoke-virtual {v0, p3}, Lx7/e;->v(Ljava/lang/String;)V

    .line 3
    :cond_0
    invoke-direct {p0, p1, p2}, Lf8/h;->G0(Ljava/lang/String;Lf8/d$b;)V

    return-void
.end method

.method static synthetic I(Lf8/h;)V
    .locals 0

    invoke-direct {p0}, Lf8/h;->f1()V

    return-void
.end method

.method private I0(Ljava/util/List;Lf8/h$o;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lf8/h$n;",
            ">;",
            "Lf8/h$o;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->E()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf8/h;->a:Lf8/i;

    const-string v1, "fff"

    invoke-interface {v0, v1}, Lf8/i;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/android/billingclient/api/f;->b()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, -0x2

    const-string v0, "QueryProductDetailsAsync"

    .line 3
    invoke-direct {p0, v0, p1}, Lf8/h;->P0(Ljava/lang/String;I)V

    const-string p1, "rbx.purchaseflow"

    const-string v0, "ProductDetails feature is not supported."

    .line 4
    invoke-static {p1, v0}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    invoke-direct {p0}, Lf8/h;->W0()V

    const/4 p1, 0x0

    .line 6
    invoke-interface {p2, p1}, Lf8/h$o;->a(Ljava/util/List;)V

    return-void

    .line 7
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf8/h$n;

    .line 9
    invoke-static {}, Lcom/android/billingclient/api/h$b;->a()Lcom/android/billingclient/api/h$b$a;

    move-result-object v3

    iget-object v4, v2, Lf8/h$n;->a:Ljava/lang/String;

    .line 10
    invoke-virtual {v3, v4}, Lcom/android/billingclient/api/h$b$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/h$b$a;

    move-result-object v3

    iget-object v2, v2, Lf8/h$n;->b:Ljava/lang/String;

    .line 11
    invoke-virtual {v3, v2}, Lcom/android/billingclient/api/h$b$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/h$b$a;

    move-result-object v2

    .line 12
    invoke-virtual {v2}, Lcom/android/billingclient/api/h$b$a;->a()Lcom/android/billingclient/api/h$b;

    move-result-object v2

    .line 13
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 14
    :cond_1
    invoke-static {}, Lcom/android/billingclient/api/h;->a()Lcom/android/billingclient/api/h$a;

    move-result-object v1

    .line 15
    invoke-virtual {v1, v0}, Lcom/android/billingclient/api/h$a;->b(Ljava/util/List;)Lcom/android/billingclient/api/h$a;

    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lcom/android/billingclient/api/h$a;->a()Lcom/android/billingclient/api/h;

    move-result-object v0

    .line 17
    iget-object v1, p0, Lf8/h;->a:Lf8/i;

    new-instance v2, Lf8/g;

    invoke-direct {v2, p0, p1, p2}, Lf8/g;-><init>(Lf8/h;Ljava/util/List;Lf8/h$o;)V

    invoke-interface {v1, v0, v2}, Lf8/i;->a(Lcom/android/billingclient/api/h;Ln1/g;)V

    return-void
.end method

.method static synthetic J(Lf8/h;)V
    .locals 0

    invoke-direct {p0}, Lf8/h;->h1()V

    return-void
.end method

.method private J0()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lf8/h;->K0(Lf8/h$p;)V

    return-void
.end method

.method static synthetic K(Lf8/h;Lcom/android/billingclient/api/Purchase;Lf8/d$b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lf8/h;->Y(Lcom/android/billingclient/api/Purchase;Lf8/d$b;)V

    return-void
.end method

.method private K0(Lf8/h$p;)V
    .locals 4

    const-string v0, "rbx.purchaseflow"

    const-string v1, "Attempt queryInAppProduct"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->E()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lf8/h;->a:Lf8/i;

    const-string v2, "fff"

    invoke-interface {v1, v2}, Lf8/i;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f;

    move-result-object v1

    .line 3
    invoke-virtual {v1}, Lcom/android/billingclient/api/f;->b()I

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, -0x2

    const-string v2, "QueryProductDetailsAsync"

    .line 4
    invoke-direct {p0, v2, v1}, Lf8/h;->P0(Ljava/lang/String;I)V

    const-string v1, "ProductDetails feature is not supported."

    .line 5
    invoke-static {v0, v1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    invoke-direct {p0}, Lf8/h;->W0()V

    if-eqz p1, :cond_0

    .line 7
    invoke-interface {p1}, Lf8/h$p;->a()V

    :cond_0
    return-void

    .line 8
    :cond_1
    iget-object v1, p0, Lf8/h;->c:Lf8/h$m;

    sget-object v2, Lf8/h$m;->p:Lf8/h$m;

    if-ne v1, v2, :cond_3

    const-string v1, "queryInAppProduct is setup already"

    .line 9
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_2

    .line 10
    invoke-interface {p1}, Lf8/h$p;->a()V

    :cond_2
    return-void

    .line 11
    :cond_3
    sget-object v2, Lf8/h$m;->n:Lf8/h$m;

    if-eq v1, v2, :cond_4

    const-string p1, "queryInAppProduct is pending"

    .line 12
    invoke-static {v0, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 13
    :cond_4
    invoke-static {}, Lf8/h;->g0()Ljava/util/List;

    move-result-object v0

    .line 14
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 16
    invoke-static {}, Lcom/android/billingclient/api/h$b;->a()Lcom/android/billingclient/api/h$b$a;

    move-result-object v3

    .line 17
    invoke-virtual {v3, v2}, Lcom/android/billingclient/api/h$b$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/h$b$a;

    move-result-object v2

    const-string v3, "inapp"

    .line 18
    invoke-virtual {v2, v3}, Lcom/android/billingclient/api/h$b$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/h$b$a;

    move-result-object v2

    .line 19
    invoke-virtual {v2}, Lcom/android/billingclient/api/h$b$a;->a()Lcom/android/billingclient/api/h$b;

    move-result-object v2

    .line 20
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 21
    :cond_5
    invoke-static {}, Lcom/android/billingclient/api/h;->a()Lcom/android/billingclient/api/h$a;

    move-result-object v0

    .line 22
    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/h$a;->b(Ljava/util/List;)Lcom/android/billingclient/api/h$a;

    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lcom/android/billingclient/api/h$a;->a()Lcom/android/billingclient/api/h;

    move-result-object v0

    .line 24
    sget-object v1, Lf8/h$m;->o:Lf8/h$m;

    iput-object v1, p0, Lf8/h;->c:Lf8/h$m;

    .line 25
    iget-object v1, p0, Lf8/h;->a:Lf8/i;

    new-instance v2, Lf8/h$e;

    invoke-direct {v2, p0, p1}, Lf8/h$e;-><init>(Lf8/h;Lf8/h$p;)V

    invoke-interface {v1, v0, v2}, Lf8/i;->a(Lcom/android/billingclient/api/h;Ln1/g;)V

    return-void
.end method

.method static synthetic L(Lf8/h;)V
    .locals 0

    invoke-direct {p0}, Lf8/h;->O0()V

    return-void
.end method

.method private L0()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lf8/h;->M0(Lf8/h$p;)V

    return-void
.end method

.method static synthetic M(Lf8/h;Lcom/android/billingclient/api/Purchase;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lf8/h;->Z(Lcom/android/billingclient/api/Purchase;Z)V

    return-void
.end method

.method private M0(Lf8/h$p;)V
    .locals 5

    const-string v0, "rbx.purchaseflow"

    const-string v1, "Attempt querySubsProduct"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v2, p0, Lf8/h;->a:Lf8/i;

    const-string v3, "subscriptions"

    invoke-interface {v2, v3}, Lf8/i;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f;

    move-result-object v2

    .line 3
    invoke-virtual {v2}, Lcom/android/billingclient/api/f;->b()I

    move-result v2

    const/4 v3, -0x2

    if-eqz v2, :cond_0

    const-string p1, "IsSubscriptionsSupported"

    .line 4
    invoke-direct {p0, p1, v3}, Lf8/h;->P0(Ljava/lang/String;I)V

    const-string p1, "Google Billing Client does not support subscription purchases."

    .line 5
    invoke-static {v0, p1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 6
    :cond_0
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v2

    invoke-interface {v2}, Lc7/e;->E()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lf8/h;->a:Lf8/i;

    const-string v4, "fff"

    invoke-interface {v2, v4}, Lf8/i;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f;

    move-result-object v2

    .line 7
    invoke-virtual {v2}, Lcom/android/billingclient/api/f;->b()I

    move-result v2

    if-eqz v2, :cond_2

    const-string v1, "QueryProductDetailsAsync"

    .line 8
    invoke-direct {p0, v1, v3}, Lf8/h;->P0(Ljava/lang/String;I)V

    const-string v1, "ProductDetails feature is not supported."

    .line 9
    invoke-static {v0, v1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    invoke-direct {p0}, Lf8/h;->W0()V

    if-eqz p1, :cond_1

    .line 11
    invoke-interface {p1}, Lf8/h$p;->a()V

    :cond_1
    return-void

    .line 12
    :cond_2
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    iget-object v1, p0, Lf8/h;->d:Lf8/h$m;

    sget-object v2, Lf8/h$m;->p:Lf8/h$m;

    if-ne v1, v2, :cond_4

    const-string v1, "querySubsProduct is setup already"

    .line 14
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_3

    .line 15
    invoke-interface {p1}, Lf8/h$p;->a()V

    :cond_3
    return-void

    .line 16
    :cond_4
    sget-object v2, Lf8/h$m;->n:Lf8/h$m;

    if-eq v1, v2, :cond_5

    const-string p1, "querySubsProduct is pending"

    .line 17
    invoke-static {v0, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 18
    :cond_5
    invoke-static {}, Lf8/h;->m0()Ljava/util/List;

    move-result-object v1

    .line 19
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 20
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 21
    invoke-static {}, Lcom/android/billingclient/api/h$b;->a()Lcom/android/billingclient/api/h$b$a;

    move-result-object v4

    .line 22
    invoke-virtual {v4, v3}, Lcom/android/billingclient/api/h$b$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/h$b$a;

    move-result-object v3

    const-string v4, "subs"

    .line 23
    invoke-virtual {v3, v4}, Lcom/android/billingclient/api/h$b$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/h$b$a;

    move-result-object v3

    .line 24
    invoke-virtual {v3}, Lcom/android/billingclient/api/h$b$a;->a()Lcom/android/billingclient/api/h$b;

    move-result-object v3

    .line 25
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 26
    :cond_6
    invoke-static {}, Lcom/android/billingclient/api/h;->a()Lcom/android/billingclient/api/h$a;

    move-result-object v1

    .line 27
    invoke-virtual {v1, v2}, Lcom/android/billingclient/api/h$a;->b(Ljava/util/List;)Lcom/android/billingclient/api/h$a;

    move-result-object v1

    .line 28
    invoke-virtual {v1}, Lcom/android/billingclient/api/h$a;->a()Lcom/android/billingclient/api/h;

    move-result-object v1

    .line 29
    sget-object v3, Lf8/h$m;->o:Lf8/h$m;

    iput-object v3, p0, Lf8/h;->d:Lf8/h$m;

    .line 30
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Querying SUBS ProductDetails. Count = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    iget-object v0, p0, Lf8/h;->a:Lf8/i;

    new-instance v2, Lf8/h$f;

    invoke-direct {v2, p0, p1}, Lf8/h$f;-><init>(Lf8/h;Lf8/h$p;)V

    invoke-interface {v0, v1, v2}, Lf8/i;->a(Lcom/android/billingclient/api/h;Ln1/g;)V

    return-void
.end method

.method static synthetic N(Lf8/h;)Ljava/util/Hashtable;
    .locals 0

    iget-object p0, p0, Lf8/h;->g:Ljava/util/Hashtable;

    return-object p0
.end method

.method private N0()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lf8/h;->i:Landroid/app/Activity;

    .line 2
    iput-object v0, p0, Lf8/h;->r:Le8/g;

    .line 3
    iput-object v0, p0, Lf8/h;->j:Ljava/lang/String;

    const-wide/16 v1, 0x0

    .line 4
    iput-wide v1, p0, Lf8/h;->n:J

    .line 5
    iput-object v0, p0, Lf8/h;->t:Ljava/lang/String;

    .line 6
    iput-object v0, p0, Lf8/h;->k:Ljava/lang/String;

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lf8/h;->o:Z

    return-void
.end method

.method static synthetic O(Lf8/h;)V
    .locals 0

    invoke-direct {p0}, Lf8/h;->Q0()V

    return-void
.end method

.method private O0()V
    .locals 2

    .line 1
    invoke-static {}, Lx6/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lf8/h;->p:Lx7/e;

    invoke-virtual {p0}, Lf8/h;->s0()Z

    move-result v1

    invoke-virtual {v0, v1}, Lx7/e;->x(Z)V

    :cond_0
    return-void
.end method

.method static synthetic P(Lf8/h;)Ljava/util/Hashtable;
    .locals 0

    iget-object p0, p0, Lf8/h;->f:Ljava/util/Hashtable;

    return-object p0
.end method

.method private P0(Ljava/lang/String;I)V
    .locals 2

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->X0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lx6/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lf8/h;->p:Lx7/e;

    iget-boolean v1, p0, Lf8/h;->o:Z

    invoke-virtual {v0, p1, p2, v1}, Lx7/e;->y(Ljava/lang/String;IZ)V

    :cond_0
    return-void
.end method

.method static synthetic Q(Lf8/h;Ljava/util/List;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lf8/h;->h0(Ljava/util/List;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private Q0()V
    .locals 2

    .line 1
    invoke-static {}, Lx6/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lf8/h;->p:Lx7/e;

    invoke-virtual {p0}, Lf8/h;->s0()Z

    move-result v1

    invoke-virtual {v0, v1}, Lx7/e;->z(Z)V

    :cond_0
    return-void
.end method

.method static synthetic R(Lf8/h;Lf8/h$m;)Lf8/h$m;
    .locals 0

    iput-object p1, p0, Lf8/h;->d:Lf8/h$m;

    return-object p1
.end method

.method private R0()V
    .locals 1

    .line 1
    invoke-static {}, Lx6/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lf8/h;->p:Lx7/e;

    invoke-virtual {v0}, Lx7/e;->D()V

    :cond_0
    return-void
.end method

.method static synthetic S(Lf8/h;)Z
    .locals 0

    iget-boolean p0, p0, Lf8/h;->m:Z

    return p0
.end method

.method private S0()V
    .locals 1

    .line 1
    invoke-static {}, Lx6/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lf8/h;->p:Lx7/e;

    invoke-virtual {v0}, Lx7/e;->U()V

    :cond_0
    return-void
.end method

.method static synthetic T(Lf8/h;Ljava/lang/String;Z)Lcom/android/billingclient/api/g;
    .locals 0

    invoke-direct {p0, p1, p2}, Lf8/h;->i0(Ljava/lang/String;Z)Lcom/android/billingclient/api/g;

    move-result-object p0

    return-object p0
.end method

.method private T0()V
    .locals 3

    .line 1
    invoke-static {}, Lx6/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lf8/h;->p:Lx7/e;

    invoke-virtual {p0}, Lf8/h;->s0()Z

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lx7/e;->V(ZZ)V

    :cond_0
    return-void
.end method

.method static synthetic U(Lf8/h;Ljava/lang/String;Lcom/android/billingclient/api/g;Z)Z
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lf8/h;->A0(Ljava/lang/String;Lcom/android/billingclient/api/g;Z)Z

    move-result p0

    return p0
.end method

.method private U0()V
    .locals 3

    .line 1
    invoke-static {}, Lx6/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lf8/h;->p:Lx7/e;

    invoke-virtual {p0}, Lf8/h;->s0()Z

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lx7/e;->W(ZZ)V

    :cond_0
    return-void
.end method

.method static synthetic V(Lf8/h;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lf8/h;->k:Ljava/lang/String;

    return-object p1
.end method

.method private V0()V
    .locals 3

    .line 1
    invoke-static {}, Lx6/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lf8/h;->p:Lx7/e;

    invoke-virtual {p0}, Lf8/h;->s0()Z

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lx7/e;->d0(ZZ)V

    :cond_0
    return-void
.end method

.method private W(Lcom/android/billingclient/api/Purchase;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->i()Z

    move-result v0

    const-string v1, "rbx.purchaseflow"

    if-nez v0, :cond_0

    const-string v0, "Acknowledging Purchase"

    .line 2
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    new-instance v0, Lf8/h$k;

    invoke-direct {v0, p0, p1}, Lf8/h$k;-><init>(Lf8/h;Lcom/android/billingclient/api/Purchase;)V

    invoke-direct {p0, p1, v0}, Lf8/h;->X(Lcom/android/billingclient/api/Purchase;Ln1/b;)V

    goto :goto_0

    :cond_0
    const-string v0, "Attempted to acknowledge an acknowledged purchase."

    .line 4
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->V0()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    sget-object v0, Lf8/d$b;->x:Lf8/d$b;

    invoke-direct {p0, p1, v0}, Lf8/h;->Y(Lcom/android/billingclient/api/Purchase;Lf8/d$b;)V

    return-void

    :cond_1
    const/4 v0, 0x1

    .line 7
    invoke-direct {p0, p1, v0}, Lf8/h;->Z(Lcom/android/billingclient/api/Purchase;Z)V

    :goto_0
    return-void
.end method

.method private W0()V
    .locals 3

    .line 1
    invoke-static {}, Lx6/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lf8/h;->p:Lx7/e;

    iget-boolean v1, p0, Lf8/h;->o:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lx7/e;->X(ZZ)V

    :cond_0
    return-void
.end method

.method private X(Lcom/android/billingclient/api/Purchase;Ln1/b;)V
    .locals 2

    const-string v0, "rbx.purchaseflow"

    const-string v1, "Start acknowledging Purchase"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Ln1/a;->b()Ln1/a$a;

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->g()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ln1/a$a;->b(Ljava/lang/String;)Ln1/a$a;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Ln1/a$a;->a()Ln1/a;

    move-result-object p1

    .line 5
    iget-object v0, p0, Lf8/h;->a:Lf8/i;

    invoke-interface {v0, p1, p2}, Lf8/i;->c(Ln1/a;Ln1/b;)V

    return-void
.end method

.method private X0()V
    .locals 3

    .line 1
    invoke-static {}, Lx6/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lf8/h;->p:Lx7/e;

    invoke-virtual {p0}, Lf8/h;->s0()Z

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lx7/e;->Y(ZZ)V

    :cond_0
    return-void
.end method

.method private Y(Lcom/android/billingclient/api/Purchase;Lf8/d$b;)V
    .locals 2

    const-string v0, "rbx.purchaseflow"

    const-string v1, "Acknowledged Purchase"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-direct {p0, p1}, Lf8/h;->y0(Lcom/android/billingclient/api/Purchase;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lf8/h;->g:Ljava/util/Hashtable;

    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-virtual {p0, p1}, Lf8/h;->g(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lf8/h;->G0(Ljava/lang/String;Lf8/d$b;)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lf8/h;->c0(Lcom/android/billingclient/api/Purchase;)V

    :goto_0
    return-void
.end method

.method private Y0()V
    .locals 3

    .line 1
    invoke-static {}, Lx6/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lf8/h;->p:Lx7/e;

    invoke-virtual {p0}, Lf8/h;->s0()Z

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lx7/e;->Z(ZZ)V

    :cond_0
    return-void
.end method

.method private Z(Lcom/android/billingclient/api/Purchase;Z)V
    .locals 1

    const-string v0, "rbx.purchaseflow"

    if-eqz p2, :cond_1

    const-string p2, "Acknowledged Purchase"

    .line 1
    invoke-static {v0, p2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-direct {p0, p1}, Lf8/h;->y0(Lcom/android/billingclient/api/Purchase;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 3
    invoke-direct {p0, p1}, Lf8/h;->c0(Lcom/android/billingclient/api/Purchase;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p2, p0, Lf8/h;->g:Ljava/util/Hashtable;

    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 5
    iget-object p2, p0, Lf8/h;->g:Ljava/util/Hashtable;

    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    const-string p2, "Failed to acknowledge Purchase"

    .line 6
    invoke-static {v0, p2}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    invoke-direct {p0}, Lf8/h;->O0()V

    .line 8
    invoke-virtual {p0, p1}, Lf8/h;->g(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lf8/d$b;->u:Lf8/d$b;

    const-string v0, "OnAcknowledgePurchaseResponse failure"

    invoke-direct {p0, p1, p2, v0}, Lf8/h;->H0(Ljava/lang/String;Lf8/d$b;Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private Z0()V
    .locals 3

    .line 1
    invoke-static {}, Lx6/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lf8/h;->p:Lx7/e;

    iget-boolean v1, p0, Lf8/h;->o:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lx7/e;->a0(ZZ)V

    :cond_0
    return-void
.end method

.method private a1()V
    .locals 3

    .line 1
    invoke-static {}, Lx6/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lf8/h;->p:Lx7/e;

    invoke-virtual {p0}, Lf8/h;->s0()Z

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lx7/e;->b0(ZZ)V

    :cond_0
    return-void
.end method

.method private b1()V
    .locals 3

    .line 1
    invoke-static {}, Lx6/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lf8/h;->p:Lx7/e;

    invoke-virtual {p0}, Lf8/h;->s0()Z

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lx7/e;->c0(ZZ)V

    :cond_0
    return-void
.end method

.method private c0(Lcom/android/billingclient/api/Purchase;)V
    .locals 3

    const-string v0, "rbx.purchaseflow"

    const-string v1, "Consuming Purchase"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Ln1/e;->b()Ln1/e$a;

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln1/e$a;->b(Ljava/lang/String;)Ln1/e$a;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Ln1/e$a;->a()Ln1/e;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lf8/h;->a:Lf8/i;

    new-instance v2, Lf8/h$l;

    invoke-direct {v2, p0, p1}, Lf8/h$l;-><init>(Lf8/h;Lcom/android/billingclient/api/Purchase;)V

    invoke-interface {v1, v0, v2}, Lf8/i;->e(Ln1/e;Ln1/f;)V

    return-void
.end method

.method private c1()V
    .locals 3

    .line 1
    invoke-static {}, Lx6/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lf8/h;->p:Lx7/e;

    invoke-virtual {p0}, Lf8/h;->s0()Z

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lx7/e;->e0(ZZ)V

    :cond_0
    return-void
.end method

.method public static synthetic d(Lf8/h;Lf8/b;ZLjava/util/List;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lf8/h;->E0(Lf8/b;ZLjava/util/List;)V

    return-void
.end method

.method private d0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lf8/h;->r:Le8/g;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Le8/g;->e()V

    .line 3
    :cond_0
    new-instance v0, Le8/e;

    iget-object v1, p0, Lf8/h;->q:Lh7/f;

    invoke-direct {v0, v1}, Le8/e;-><init>(Lh7/f;)V

    .line 4
    invoke-virtual {p0}, Lf8/h;->s0()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5
    invoke-static {}, Lcom/roblox/client/p0;->c1()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lf8/h;->j:Ljava/lang/String;

    iget-object v3, p0, Lf8/h;->k:Ljava/lang/String;

    iget-object v4, p0, Lf8/h;->u:Le8/e$d;

    invoke-virtual {v0, v1, v2, v3, v4}, Le8/e;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le8/e$d;)V

    goto :goto_0

    .line 6
    :cond_1
    invoke-static {}, Lcom/roblox/client/p0;->c1()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lf8/h;->j:Ljava/lang/String;

    iget-object v3, p0, Lf8/h;->k:Ljava/lang/String;

    iget-object v4, p0, Lf8/h;->u:Le8/e$d;

    invoke-virtual {v0, v1, v2, v3, v4}, Le8/e;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le8/e$d;)V

    :goto_0
    return-void
.end method

.method private d1()V
    .locals 1

    .line 1
    invoke-static {}, Lx6/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lf8/h;->p:Lx7/e;

    invoke-virtual {v0}, Lx7/e;->f0()V

    :cond_0
    return-void
.end method

.method public static synthetic e(Lf8/h;Ljava/util/List;Lf8/h$o;Lcom/android/billingclient/api/f;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lf8/h;->D0(Ljava/util/List;Lf8/h$o;Lcom/android/billingclient/api/f;Ljava/util/List;)V

    return-void
.end method

.method private e0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lf8/h;->r:Le8/g;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Le8/g;->d()V

    .line 3
    :cond_0
    iget-object v0, p0, Lf8/h;->p:Lx7/e;

    const-string v1, "PurchaseStarted."

    invoke-virtual {v0, v1}, Lx7/e;->v(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lf8/h;->j:Ljava/lang/String;

    iget-boolean v1, p0, Lf8/h;->m:Z

    invoke-direct {p0, v0, v1}, Lf8/h;->i0(Ljava/lang/String;Z)Lcom/android/billingclient/api/g;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lf8/h;->j:Ljava/lang/String;

    iget-boolean v2, p0, Lf8/h;->m:Z

    invoke-direct {p0, v1, v0, v2}, Lf8/h;->A0(Ljava/lang/String;Lcom/android/billingclient/api/g;Z)Z

    move-result v1

    if-nez v1, :cond_1

    return-void

    .line 6
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    iget-boolean v2, p0, Lf8/h;->m:Z

    if-eqz v2, :cond_2

    .line 8
    invoke-virtual {v0}, Lcom/android/billingclient/api/g;->d()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    .line 9
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/android/billingclient/api/g$d;

    .line 10
    invoke-virtual {v2}, Lcom/android/billingclient/api/g$d;->a()Ljava/lang/String;

    move-result-object v2

    .line 11
    invoke-static {}, Lcom/android/billingclient/api/e$b;->a()Lcom/android/billingclient/api/e$b$a;

    move-result-object v3

    .line 12
    invoke-virtual {v3, v0}, Lcom/android/billingclient/api/e$b$a;->c(Lcom/android/billingclient/api/g;)Lcom/android/billingclient/api/e$b$a;

    move-result-object v0

    .line 13
    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/e$b$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/e$b$a;

    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/android/billingclient/api/e$b$a;->a()Lcom/android/billingclient/api/e$b;

    move-result-object v0

    .line 15
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 16
    :cond_2
    invoke-static {}, Lcom/android/billingclient/api/e$b;->a()Lcom/android/billingclient/api/e$b$a;

    move-result-object v2

    .line 17
    invoke-virtual {v2, v0}, Lcom/android/billingclient/api/e$b$a;->c(Lcom/android/billingclient/api/g;)Lcom/android/billingclient/api/e$b$a;

    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lcom/android/billingclient/api/e$b$a;->a()Lcom/android/billingclient/api/e$b;

    move-result-object v0

    .line 19
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    :goto_0
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->t1()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lf8/h;->t:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 21
    invoke-static {}, Lcom/android/billingclient/api/e;->a()Lcom/android/billingclient/api/e$a;

    move-result-object v0

    iget-object v2, p0, Lf8/h;->l:Ljava/lang/String;

    .line 22
    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/e$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/e$a;

    move-result-object v0

    iget-object v2, p0, Lf8/h;->t:Ljava/lang/String;

    .line 23
    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/e$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/e$a;

    move-result-object v0

    .line 24
    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/e$a;->d(Ljava/util/List;)Lcom/android/billingclient/api/e$a;

    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lcom/android/billingclient/api/e$a;->a()Lcom/android/billingclient/api/e;

    move-result-object v0

    goto :goto_1

    .line 26
    :cond_3
    invoke-static {}, Lcom/android/billingclient/api/e;->a()Lcom/android/billingclient/api/e$a;

    move-result-object v0

    iget-object v2, p0, Lf8/h;->l:Ljava/lang/String;

    .line 27
    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/e$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/e$a;

    move-result-object v0

    .line 28
    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/e$a;->d(Ljava/util/List;)Lcom/android/billingclient/api/e$a;

    move-result-object v0

    .line 29
    invoke-virtual {v0}, Lcom/android/billingclient/api/e$a;->a()Lcom/android/billingclient/api/e;

    move-result-object v0

    .line 30
    :goto_1
    iget-object v1, p0, Lf8/h;->i:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    if-nez v1, :cond_4

    .line 31
    iget-object v1, p0, Lf8/h;->i:Landroid/app/Activity;

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v1, v2}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 32
    :cond_4
    iget-object v1, p0, Lf8/h;->a:Lf8/i;

    iget-object v2, p0, Lf8/h;->i:Landroid/app/Activity;

    invoke-interface {v1, v2, v0}, Lf8/i;->h(Landroid/app/Activity;Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/f;->b()I

    move-result v0

    const-string v1, "LaunchBillingFlow"

    .line 33
    invoke-direct {p0, v1, v0}, Lf8/h;->P0(Ljava/lang/String;I)V

    if-eqz v0, :cond_5

    .line 34
    iget-object v0, p0, Lf8/h;->j:Ljava/lang/String;

    sget-object v1, Lf8/d$b;->F:Lf8/d$b;

    const-string v2, "BillingClient.launchBillingFlow failed"

    invoke-direct {p0, v0, v1, v2}, Lf8/h;->H0(Ljava/lang/String;Lf8/d$b;Ljava/lang/String;)V

    :cond_5
    return-void
.end method

.method private e1()V
    .locals 1

    .line 1
    invoke-static {}, Lx6/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lf8/h;->p:Lx7/e;

    invoke-virtual {v0}, Lx7/e;->g0()V

    :cond_0
    return-void
.end method

.method public static synthetic f(Lf8/h;Ljava/util/Map;ZLjava/util/List;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lf8/h;->C0(Ljava/util/Map;ZLjava/util/List;)V

    return-void
.end method

.method public static f0(Landroid/content/Context;)Lf8/h;
    .locals 4

    .line 1
    sget-object v0, Lf8/h;->y:Lf8/h;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lh7/h;

    invoke-direct {v0}, Lh7/h;-><init>()V

    .line 3
    new-instance v1, Lf8/a;

    invoke-direct {v1}, Lf8/a;-><init>()V

    .line 4
    new-instance v2, Lf8/h;

    invoke-static {}, Lx7/e;->h()Lx7/e;

    move-result-object v3

    invoke-direct {v2, v1, v0, v3}, Lf8/h;-><init>(Lf8/i;Lh7/f;Lx7/e;)V

    sput-object v2, Lf8/h;->y:Lf8/h;

    .line 5
    invoke-static {p0}, Lcom/android/billingclient/api/c;->f(Landroid/content/Context;)Lcom/android/billingclient/api/c$a;

    move-result-object p0

    sget-object v0, Lf8/h;->y:Lf8/h;

    iget-object v0, v0, Lf8/h;->v:Ln1/j;

    .line 6
    invoke-virtual {p0, v0}, Lcom/android/billingclient/api/c$a;->c(Ln1/j;)Lcom/android/billingclient/api/c$a;

    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/android/billingclient/api/c$a;->b()Lcom/android/billingclient/api/c$a;

    move-result-object p0

    .line 8
    invoke-virtual {p0}, Lcom/android/billingclient/api/c$a;->a()Lcom/android/billingclient/api/c;

    move-result-object p0

    .line 9
    sget-object v0, Lf8/h;->y:Lf8/h;

    invoke-virtual {v0, p0}, Lf8/h;->i1(Lcom/android/billingclient/api/c;)V

    .line 10
    :cond_0
    sget-object p0, Lf8/h;->y:Lf8/h;

    return-object p0
.end method

.method private f1()V
    .locals 3

    .line 1
    invoke-static {}, Lx6/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lf8/h;->p:Lx7/e;

    invoke-virtual {p0}, Lf8/h;->s0()Z

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lx7/e;->h0(ZZ)V

    :cond_0
    return-void
.end method

.method private static g0()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->e1()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 3
    sget-object v1, Lf8/h;->A:Ljava/util/List;

    if-nez v1, :cond_0

    const-string v1, ","

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lf8/h;->A:Ljava/util/List;

    .line 5
    :cond_0
    sget-object v0, Lf8/h;->A:Ljava/util/List;

    return-object v0

    .line 6
    :cond_1
    sget-object v0, Lf8/h;->z:Ljava/util/List;

    return-object v0
.end method

.method private g1()V
    .locals 3

    .line 1
    invoke-static {}, Lx6/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lf8/h;->p:Lx7/e;

    invoke-virtual {p0}, Lf8/h;->s0()Z

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lx7/e;->i0(ZZ)V

    :cond_0
    return-void
.end method

.method static synthetic h(Lf8/h;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lf8/h;->P0(Ljava/lang/String;I)V

    return-void
.end method

.method private h0(Ljava/util/List;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/Purchase;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const-string v0, ""

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/billingclient/api/Purchase;

    .line 2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Lf8/h;->g(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "; "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private h1()V
    .locals 3

    .line 1
    invoke-static {}, Lx6/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lf8/h;->p:Lx7/e;

    invoke-virtual {p0}, Lf8/h;->s0()Z

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lx7/e;->j0(ZZ)V

    :cond_0
    return-void
.end method

.method static synthetic i(Lf8/h;Lcom/android/billingclient/api/g;Z)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1, p2}, Lf8/h;->l0(Lcom/android/billingclient/api/g;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private i0(Ljava/lang/String;Z)Lcom/android/billingclient/api/g;
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 1
    :cond_0
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->t1()Z

    move-result v1

    if-eqz v1, :cond_3

    if-eqz p2, :cond_1

    .line 2
    iget-object v1, p0, Lf8/h;->f:Ljava/util/Hashtable;

    invoke-virtual {v1, p1}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3
    iget-object p2, p0, Lf8/h;->f:Ljava/util/Hashtable;

    invoke-virtual {p2, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/billingclient/api/g;

    return-object p1

    :cond_1
    if-nez p2, :cond_2

    .line 4
    iget-object p2, p0, Lf8/h;->e:Ljava/util/Hashtable;

    invoke-virtual {p2, p1}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 5
    iget-object p2, p0, Lf8/h;->e:Ljava/util/Hashtable;

    invoke-virtual {p2, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/billingclient/api/g;

    return-object p1

    .line 6
    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to get product details for productId: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc9/k;->b(Ljava/lang/String;)I

    return-object v0

    :cond_3
    if-eqz p2, :cond_4

    .line 7
    iget-object p2, p0, Lf8/h;->f:Ljava/util/Hashtable;

    invoke-virtual {p2, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/billingclient/api/g;

    return-object p1

    .line 8
    :cond_4
    iget-object p2, p0, Lf8/h;->e:Ljava/util/Hashtable;

    invoke-virtual {p2, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/billingclient/api/g;

    return-object p1
.end method

.method static synthetic j(Lf8/h;Lf8/h$m;)Lf8/h$m;
    .locals 0

    iput-object p1, p0, Lf8/h;->b:Lf8/h$m;

    return-object p1
.end method

.method public static j0(Lcom/android/billingclient/api/g;Z)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0}, Lcom/android/billingclient/api/g;->d()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Ljava/util/List;

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/android/billingclient/api/g$d;

    invoke-virtual {p0}, Lcom/android/billingclient/api/g$d;->b()Lcom/android/billingclient/api/g$c;

    move-result-object p0

    invoke-virtual {p0}, Lcom/android/billingclient/api/g$c;->a()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/android/billingclient/api/g$b;

    invoke-virtual {p0}, Lcom/android/billingclient/api/g$b;->a()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/android/billingclient/api/g;->a()Lcom/android/billingclient/api/g$a;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/android/billingclient/api/g$a;->a()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private j1(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;JLe8/g;Z)Z
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "startPurchase productId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isSubscriptionPurchase: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p7, "isInApp: "

    invoke-virtual {v0, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p0}, Lf8/h;->s0()Z

    move-result p7

    invoke-virtual {v0, p7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p7

    const-string v0, "rbx.purchaseflow"

    .line 3
    invoke-static {v0, p7}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    iput-object p1, p0, Lf8/h;->l:Ljava/lang/String;

    .line 5
    invoke-virtual {p0}, Lf8/h;->v0()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 6
    :cond_0
    iput-object p6, p0, Lf8/h;->r:Le8/g;

    .line 7
    iput-wide p4, p0, Lf8/h;->n:J

    .line 8
    iput-object p2, p0, Lf8/h;->j:Ljava/lang/String;

    .line 9
    iput-object p3, p0, Lf8/h;->i:Landroid/app/Activity;

    .line 10
    invoke-direct {p0, p2}, Lf8/h;->u0(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lf8/h;->m:Z

    .line 11
    new-instance p1, Lf8/h$g;

    invoke-direct {p1, p0, p2}, Lf8/h$g;-><init>(Lf8/h;Ljava/lang/String;)V

    .line 12
    iget-boolean p2, p0, Lf8/h;->m:Z

    if-eqz p2, :cond_1

    .line 13
    invoke-direct {p0, p1}, Lf8/h;->M0(Lf8/h$p;)V

    goto :goto_0

    .line 14
    :cond_1
    invoke-direct {p0, p1}, Lf8/h;->K0(Lf8/h$p;)V

    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method static synthetic k(Lf8/h;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lf8/h;->l:Ljava/lang/String;

    return-object p0
.end method

.method public static k0(Lcom/android/billingclient/api/g;Z)J
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0}, Lcom/android/billingclient/api/g;->d()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Ljava/util/List;

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/android/billingclient/api/g$d;

    invoke-virtual {p0}, Lcom/android/billingclient/api/g$d;->b()Lcom/android/billingclient/api/g$c;

    move-result-object p0

    invoke-virtual {p0}, Lcom/android/billingclient/api/g$c;->a()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/android/billingclient/api/g$b;

    invoke-virtual {p0}, Lcom/android/billingclient/api/g$b;->b()J

    move-result-wide p0

    return-wide p0

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/android/billingclient/api/g;->a()Lcom/android/billingclient/api/g$a;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/android/billingclient/api/g$a;->b()J

    move-result-wide p0

    return-wide p0
.end method

.method static synthetic l(Lf8/h;)Lx7/e;
    .locals 0

    iget-object p0, p0, Lf8/h;->p:Lx7/e;

    return-object p0
.end method

.method private l0(Lcom/android/billingclient/api/g;Z)Ljava/lang/String;
    .locals 0

    if-eqz p2, :cond_0

    .line 1
    invoke-virtual {p1}, Lcom/android/billingclient/api/g;->d()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/billingclient/api/g$d;

    invoke-virtual {p1}, Lcom/android/billingclient/api/g$d;->b()Lcom/android/billingclient/api/g$c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/g$c;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/billingclient/api/g$b;

    invoke-virtual {p1}, Lcom/android/billingclient/api/g$b;->c()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/android/billingclient/api/g;->a()Lcom/android/billingclient/api/g$a;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/android/billingclient/api/g$a;->c()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method static synthetic m(Lf8/h;)V
    .locals 0

    invoke-direct {p0}, Lf8/h;->d0()V

    return-void
.end method

.method private static m0()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->v1()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 3
    sget-object v1, Lf8/h;->C:Ljava/util/List;

    if-nez v1, :cond_0

    const-string v1, ","

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lf8/h;->C:Ljava/util/List;

    .line 5
    :cond_0
    sget-object v0, Lf8/h;->C:Ljava/util/List;

    return-object v0

    .line 6
    :cond_1
    sget-object v0, Lf8/h;->B:Ljava/util/List;

    return-object v0
.end method

.method static synthetic n(Lf8/h;)V
    .locals 0

    invoke-direct {p0}, Lf8/h;->e0()V

    return-void
.end method

.method private n0()V
    .locals 4

    const-string v0, "rbx.purchaseflow"

    const-string v1, "Do Google Purchase GrantPending"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Ln1/k;->a()Ln1/k$a;

    move-result-object v0

    const-string v1, "inapp"

    .line 3
    invoke-virtual {v0, v1}, Ln1/k$a;->b(Ljava/lang/String;)Ln1/k$a;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Ln1/k$a;->a()Ln1/k;

    move-result-object v0

    .line 5
    invoke-static {}, Ln1/k;->a()Ln1/k$a;

    move-result-object v1

    const-string v2, "subs"

    .line 6
    invoke-virtual {v1, v2}, Ln1/k$a;->b(Ljava/lang/String;)Ln1/k$a;

    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ln1/k$a;->a()Ln1/k;

    move-result-object v1

    .line 8
    iget-object v2, p0, Lf8/h;->a:Lf8/i;

    iget-object v3, p0, Lf8/h;->w:Ln1/h;

    invoke-interface {v2, v0, v3}, Lf8/i;->g(Ln1/k;Ln1/h;)V

    .line 9
    iget-object v0, p0, Lf8/h;->a:Lf8/i;

    iget-object v2, p0, Lf8/h;->x:Ln1/h;

    invoke-interface {v0, v1, v2}, Lf8/i;->g(Ln1/k;Ln1/h;)V

    return-void
.end method

.method static synthetic o(Lf8/h;)V
    .locals 0

    invoke-direct {p0}, Lf8/h;->U0()V

    return-void
.end method

.method private o0(Ljava/util/List;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/Purchase;",
            ">;Z)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->G()Z

    move-result v0

    if-nez v0, :cond_2

    .line 2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/Purchase;

    .line 3
    invoke-direct {p0, v0, p2}, Lf8/h;->p0(Lcom/android/billingclient/api/Purchase;Z)V

    goto :goto_0

    :cond_1
    return-void

    .line 4
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 5
    new-instance v1, Ljava/util/Hashtable;

    invoke-direct {v1}, Ljava/util/Hashtable;-><init>()V

    .line 6
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/android/billingclient/api/Purchase;

    .line 7
    invoke-virtual {p0, v2}, Lf8/h;->g(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object v3

    .line 8
    invoke-direct {p0, v2}, Lf8/h;->y0(Lcom/android/billingclient/api/Purchase;)Z

    move-result v4

    .line 9
    invoke-direct {p0, v3, v4}, Lf8/h;->i0(Ljava/lang/String;Z)Lcom/android/billingclient/api/g;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 10
    invoke-direct {p0, v2, p2}, Lf8/h;->p0(Lcom/android/billingclient/api/Purchase;Z)V

    goto :goto_1

    .line 11
    :cond_3
    new-instance v5, Lf8/h$n;

    if-eqz v4, :cond_4

    const-string v4, "subs"

    goto :goto_2

    :cond_4
    const-string v4, "inapp"

    :goto_2
    invoke-direct {v5, p0, v3, v4}, Lf8/h$n;-><init>(Lf8/h;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 13
    :cond_5
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_6

    .line 14
    new-instance p1, Lf8/f;

    invoke-direct {p1, p0, v1, p2}, Lf8/f;-><init>(Lf8/h;Ljava/util/Map;Z)V

    invoke-direct {p0, v0, p1}, Lf8/h;->I0(Ljava/util/List;Lf8/h$o;)V

    :cond_6
    return-void
.end method

.method static synthetic p(Lf8/h;Ljava/lang/String;Lf8/d$b;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lf8/h;->H0(Ljava/lang/String;Lf8/d$b;Ljava/lang/String;)V

    return-void
.end method

.method private p0(Lcom/android/billingclient/api/Purchase;Z)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->f()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-direct {p0}, Lf8/h;->S0()V

    goto :goto_0

    .line 3
    :cond_1
    invoke-direct {p0}, Lf8/h;->e1()V

    .line 4
    :goto_0
    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->f()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    return-void

    .line 5
    :cond_2
    iget-object v0, p0, Lf8/h;->g:Ljava/util/Hashtable;

    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->a()Lcom/android/billingclient/api/a;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/android/billingclient/api/a;->a()Ljava/lang/String;

    move-result-object v2

    .line 8
    invoke-virtual {v0}, Lcom/android/billingclient/api/a;->b()Ljava/lang/String;

    move-result-object v0

    .line 9
    iget-object v3, p0, Lf8/h;->l:Ljava/lang/String;

    if-eqz v3, :cond_3

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    :cond_3
    iget-wide v3, p0, Lf8/h;->n:J

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-lez v7, :cond_4

    .line 10
    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 11
    :cond_4
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v2

    invoke-interface {v2}, Lc7/e;->G()Z

    move-result v2

    if-eqz v2, :cond_5

    if-eqz v0, :cond_5

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 12
    :cond_5
    invoke-direct {p0}, Lf8/h;->R0()V

    .line 13
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->T0()Z

    move-result v0

    if-nez v0, :cond_6

    return-void

    .line 14
    :cond_6
    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->i()Z

    move-result v0

    if-nez v0, :cond_7

    .line 15
    invoke-direct {p0, p1, p2}, Lf8/h;->F0(Lcom/android/billingclient/api/Purchase;Z)V

    goto :goto_1

    .line 16
    :cond_7
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p2

    invoke-interface {p2}, Lc7/e;->V0()Z

    move-result p2

    if-eqz p2, :cond_8

    .line 17
    sget-object p2, Lf8/d$b;->x:Lf8/d$b;

    invoke-direct {p0, p1, p2}, Lf8/h;->Y(Lcom/android/billingclient/api/Purchase;Lf8/d$b;)V

    return-void

    .line 18
    :cond_8
    invoke-direct {p0, p1, v1}, Lf8/h;->Z(Lcom/android/billingclient/api/Purchase;Z)V

    :goto_1
    return-void
.end method

.method static synthetic q(Lf8/h;)V
    .locals 0

    invoke-direct {p0}, Lf8/h;->X0()V

    return-void
.end method

.method private q0()Z
    .locals 1

    iget-object v0, p0, Lf8/h;->g:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic r(Lf8/h;)V
    .locals 0

    invoke-direct {p0}, Lf8/h;->V0()V

    return-void
.end method

.method static synthetic s(Lf8/h;)V
    .locals 0

    invoke-direct {p0}, Lf8/h;->T0()V

    return-void
.end method

.method static synthetic t(Lf8/h;)Ljava/util/Hashtable;
    .locals 0

    iget-object p0, p0, Lf8/h;->e:Ljava/util/Hashtable;

    return-object p0
.end method

.method static synthetic u(Lf8/h;)V
    .locals 0

    invoke-direct {p0}, Lf8/h;->Y0()V

    return-void
.end method

.method private u0(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-static {}, Lf8/h;->m0()Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method static synthetic v(Lf8/h;)Lf8/i;
    .locals 0

    iget-object p0, p0, Lf8/h;->a:Lf8/i;

    return-object p0
.end method

.method static synthetic w(Lf8/h;Ljava/util/List;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lf8/h;->o0(Ljava/util/List;Z)V

    return-void
.end method

.method static synthetic x(Lf8/h;)V
    .locals 0

    invoke-direct {p0}, Lf8/h;->n0()V

    return-void
.end method

.method static synthetic y(Lf8/h;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lf8/h;->j:Ljava/lang/String;

    return-object p0
.end method

.method private y0(Lcom/android/billingclient/api/Purchase;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lf8/h;->g(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-direct {p0, p1}, Lf8/h;->u0(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->t1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lf8/h;->g0()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method static synthetic z(Lf8/h;)Le8/g;
    .locals 0

    iget-object p0, p0, Lf8/h;->r:Le8/g;

    return-object p0
.end method

.method private z0(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lf8/h;->j:Ljava/lang/String;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;JLe8/g;)Z
    .locals 9

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lf8/h;->o:Z

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    move-object v7, p6

    .line 2
    invoke-direct/range {v1 .. v8}, Lf8/h;->j1(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;JLe8/g;Z)Z

    move-result p1

    return p1
.end method

.method public a0(JLjava/lang/String;Z)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lf8/h;->n:J

    .line 2
    invoke-virtual {p0, p3, p4}, Lf8/h;->b0(Ljava/lang/String;Z)V

    return-void
.end method

.method public b(JLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;ZLe8/g;)Z
    .locals 4

    .line 1
    new-instance v0, Lf8/b;

    invoke-direct {v0, p4}, Lf8/b;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0}, Lf8/b;->b()Z

    move-result v1

    const/4 v2, 0x0

    const-string v3, "rbx.purchaseflow"

    if-nez v1, :cond_0

    .line 3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Purchase request is invalid. Raw payload: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    .line 4
    :cond_0
    invoke-virtual {v0}, Lf8/b;->c()Z

    move-result p4

    if-eqz p4, :cond_1

    iget-object p4, p0, Lf8/h;->a:Lf8/i;

    const-string v1, "subscriptions"

    invoke-interface {p4, v1}, Lf8/i;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f;

    move-result-object p4

    .line 5
    invoke-virtual {p4}, Lcom/android/billingclient/api/f;->b()I

    move-result p4

    if-eqz p4, :cond_1

    const/4 p1, -0x2

    const-string p2, "IsSubscriptionsSupported"

    .line 6
    invoke-direct {p0, p2, p1}, Lf8/h;->P0(Ljava/lang/String;I)V

    const-string p1, "Google Billing Client does not support subscription purchases."

    .line 7
    invoke-static {v3, p1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    .line 8
    :cond_1
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Initiated purchase. Params: "

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {v3, p4}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p4

    iput-object p4, p0, Lf8/h;->l:Ljava/lang/String;

    .line 10
    invoke-virtual {p0}, Lf8/h;->v0()Z

    move-result p4

    if-nez p4, :cond_2

    .line 11
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Purchasing is not enabled. Params: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    .line 12
    :cond_2
    iput-wide p1, p0, Lf8/h;->n:J

    .line 13
    invoke-virtual {v0}, Lf8/b;->d()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lf8/h;->j:Ljava/lang/String;

    .line 14
    invoke-virtual {v0}, Lf8/b;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lf8/h;->t:Ljava/lang/String;

    .line 15
    iput-object p5, p0, Lf8/h;->i:Landroid/app/Activity;

    xor-int/lit8 p1, p6, 0x1

    .line 16
    iput-boolean p1, p0, Lf8/h;->o:Z

    .line 17
    iput-object p7, p0, Lf8/h;->r:Le8/g;

    .line 18
    invoke-virtual {v0}, Lf8/b;->c()Z

    move-result p1

    iput-boolean p1, p0, Lf8/h;->m:Z

    .line 19
    invoke-virtual {v0}, Lf8/b;->c()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 20
    iget-object p1, p0, Lf8/h;->s:Ljava/util/Hashtable;

    invoke-virtual {v0}, Lf8/b;->d()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, p3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    new-instance p2, Lf8/h$n;

    invoke-virtual {v0}, Lf8/b;->d()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0}, Lf8/b;->e()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p2, p0, p3, p4}, Lf8/h$n;-><init>(Lf8/h;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    new-instance p2, Lf8/e;

    invoke-direct {p2, p0, v0, p6}, Lf8/e;-><init>(Lf8/h;Lf8/b;Z)V

    invoke-direct {p0, p1, p2}, Lf8/h;->I0(Ljava/util/List;Lf8/h$o;)V

    const/4 p1, 0x1

    return p1
.end method

.method public b0(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    iput-object p1, p0, Lf8/h;->l:Ljava/lang/String;

    .line 2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "attemptGrantPendingPurchases isAppResume:"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "rbx.purchaseflow"

    invoke-static {v0, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-virtual {p0}, Lf8/h;->w0()Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "attemptGrantPendingPurchases failed: purchasing is not setup"

    .line 4
    invoke-static {v0, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 5
    :cond_0
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->G()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lf8/h;->t0()Z

    move-result p1

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lf8/h;->m:Z

    if-nez p1, :cond_1

    const-string p1, "attemptGrantPendingPurchases failed: inapp product details missing when purchasing inapp product"

    .line 6
    invoke-static {v0, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    invoke-direct {p0}, Lf8/h;->J0()V

    return-void

    .line 8
    :cond_1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->G()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lf8/h;->x0()Z

    move-result p1

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lf8/h;->m:Z

    if-eqz p1, :cond_2

    const-string p1, "attemptGrantPendingPurchases failed: subs product details missing when purchasing subs product"

    .line 9
    invoke-static {v0, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    invoke-direct {p0}, Lf8/h;->L0()V

    return-void

    .line 11
    :cond_2
    invoke-virtual {p0}, Lf8/h;->r0()Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "attemptGrantPendingPurchases failed: purchase already pending"

    .line 12
    invoke-static {v0, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_3
    if-eqz p2, :cond_4

    .line 13
    invoke-direct {p0}, Lf8/h;->n0()V

    goto :goto_0

    .line 14
    :cond_4
    invoke-direct {p0}, Lf8/h;->q0()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 15
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Found cached pending purchase. Count = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lf8/h;->g:Ljava/util/Hashtable;

    invoke-virtual {p2}, Ljava/util/Hashtable;->size()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    invoke-direct {p0}, Lf8/h;->n0()V

    goto :goto_0

    .line 17
    :cond_5
    iget-boolean p1, p0, Lf8/h;->h:Z

    if-nez p1, :cond_6

    .line 18
    invoke-direct {p0}, Lf8/h;->n0()V

    const/4 p1, 0x1

    .line 19
    iput-boolean p1, p0, Lf8/h;->h:Z

    :cond_6
    :goto_0
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Le8/g;Z)Z
    .locals 9

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lf8/h;->o:Z

    const-wide/16 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v7, p4

    move v8, p5

    .line 2
    invoke-direct/range {v1 .. v8}, Lf8/h;->j1(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;JLe8/g;Z)Z

    move-result p1

    return p1
.end method

.method public g(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;
    .locals 0

    invoke-static {p1}, Lf8/a;->k(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public i1(Lcom/android/billingclient/api/c;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lf8/h;->b:Lf8/h$m;

    sget-object v1, Lf8/h$m;->p:Lf8/h$m;

    const-string v2, "rbx.purchaseflow"

    if-ne v0, v1, :cond_0

    const-string p1, "Google Billing Client is already setup"

    .line 2
    invoke-static {v2, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 3
    :cond_0
    sget-object v1, Lf8/h$m;->o:Lf8/h$m;

    if-ne v0, v1, :cond_1

    const-string p1, "Google Billing Client is already connecting"

    .line 4
    invoke-static {v2, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 5
    :cond_1
    iget-object v0, p0, Lf8/h;->a:Lf8/i;

    invoke-interface {v0, p1}, Lf8/i;->d(Lcom/android/billingclient/api/c;)V

    .line 6
    iput-object v1, p0, Lf8/h;->b:Lf8/h$m;

    const-string p1, "Connecting Google Billing\'s Client"

    .line 7
    invoke-static {v2, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    iget-object p1, p0, Lf8/h;->a:Lf8/i;

    new-instance v0, Lf8/h$d;

    invoke-direct {v0, p0}, Lf8/h$d;-><init>(Lf8/h;)V

    invoke-interface {p1, v0}, Lf8/i;->i(Ln1/d;)V

    return-void
.end method

.method public r0()Z
    .locals 1

    iget-object v0, p0, Lf8/h;->j:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method s0()Z
    .locals 5

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-boolean v0, p0, Lf8/h;->o:Z

    return v0

    .line 3
    :cond_0
    iget-wide v0, p0, Lf8/h;->n:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public t0()Z
    .locals 2

    iget-object v0, p0, Lf8/h;->c:Lf8/h$m;

    sget-object v1, Lf8/h$m;->p:Lf8/h$m;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public v0()Z
    .locals 1

    iget-object v0, p0, Lf8/h;->l:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lf8/h;->w0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public w0()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lf8/h;->a:Lf8/i;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lf8/h;->b:Lf8/h$m;

    sget-object v2, Lf8/h$m;->p:Lf8/h$m;

    if-ne v1, v2, :cond_0

    .line 2
    invoke-interface {v0}, Lf8/i;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public x0()Z
    .locals 2

    iget-object v0, p0, Lf8/h;->d:Lf8/h$m;

    sget-object v1, Lf8/h$m;->p:Lf8/h$m;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
