.class public final Lp3/z;
.super Lx2/e;
.source "SourceFile"

# interfaces
.implements Lq2/c;


# static fields
.field private static final l:Lx2/a$g;

.field private static final m:Lx2/a$a;

.field private static final n:Lx2/a;


# instance fields
.field private final k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lx2/a$g;

    invoke-direct {v0}, Lx2/a$g;-><init>()V

    sput-object v0, Lp3/z;->l:Lx2/a$g;

    .line 2
    new-instance v1, Lp3/u;

    invoke-direct {v1}, Lp3/u;-><init>()V

    sput-object v1, Lp3/z;->m:Lx2/a$a;

    .line 3
    new-instance v2, Lx2/a;

    const-string v3, "Auth.Api.Identity.SignIn.API"

    invoke-direct {v2, v3, v1, v0}, Lx2/a;-><init>(Ljava/lang/String;Lx2/a$a;Lx2/a$g;)V

    sput-object v2, Lp3/z;->n:Lx2/a;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lq2/h;)V
    .locals 2

    .line 1
    sget-object v0, Lp3/z;->n:Lx2/a;

    sget-object v1, Lx2/e$a;->c:Lx2/e$a;

    invoke-direct {p0, p1, v0, p2, v1}, Lx2/e;-><init>(Landroid/app/Activity;Lx2/a;Lx2/a$d;Lx2/e$a;)V

    .line 2
    invoke-static {}, Lp3/c0;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lp3/z;->k:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lq2/h;)V
    .locals 2

    .line 3
    sget-object v0, Lp3/z;->n:Lx2/a;

    sget-object v1, Lx2/e$a;->c:Lx2/e$a;

    invoke-direct {p0, p1, v0, p2, v1}, Lx2/e;-><init>(Landroid/content/Context;Lx2/a;Lx2/a$d;Lx2/e$a;)V

    .line 4
    invoke-static {}, Lp3/c0;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lp3/z;->k:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;)Lg4/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;",
            ")",
            "Lg4/l<",
            "Landroid/app/PendingIntent;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-static {p1}, Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;->C(Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;)Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest$a;

    move-result-object p1

    iget-object v0, p0, Lp3/z;->k:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest$a;->f(Ljava/lang/String;)Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest$a;

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest$a;->a()Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;

    move-result-object p1

    .line 3
    invoke-static {}, Lcom/google/android/gms/common/api/internal/d;->a()Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/google/android/gms/common/Feature;

    sget-object v2, Lp3/b0;->f:Lcom/google/android/gms/common/Feature;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/d$a;->d([Lcom/google/android/gms/common/Feature;)Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object v0

    new-instance v1, Lp3/q;

    invoke-direct {v1, p0, p1}, Lp3/q;-><init>(Lp3/z;Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;)V

    .line 5
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/d$a;->b(Ly2/k;)Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object p1

    const/16 v0, 0x613

    .line 6
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/d$a;->e(I)Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/d$a;->a()Lcom/google/android/gms/common/api/internal/d;

    move-result-object p1

    .line 8
    invoke-virtual {p0, p1}, Lx2/e;->n(Lcom/google/android/gms/common/api/internal/d;)Lg4/l;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest;)Lg4/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest;",
            ")",
            "Lg4/l<",
            "Landroid/app/PendingIntent;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-static {}, Lcom/google/android/gms/common/api/internal/d;->a()Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/google/android/gms/common/Feature;

    sget-object v2, Lp3/b0;->h:Lcom/google/android/gms/common/Feature;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 3
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/d$a;->d([Lcom/google/android/gms/common/Feature;)Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object v0

    new-instance v1, Lp3/t;

    invoke-direct {v1, p0, p1}, Lp3/t;-><init>(Lp3/z;Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/d$a;->b(Ly2/k;)Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object p1

    const/16 v0, 0x675

    .line 5
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/d$a;->e(I)Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/d$a;->a()Lcom/google/android/gms/common/api/internal/d;

    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Lx2/e;->n(Lcom/google/android/gms/common/api/internal/d;)Lg4/l;

    move-result-object p1

    return-object p1
.end method

.method public final d()Lg4/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg4/l<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lx2/e;->q()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.google.android.gms.signin"

    const/4 v2, 0x0

    .line 2
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 3
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 4
    invoke-static {}, Lx2/f;->c()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx2/f;

    .line 5
    invoke-virtual {v1}, Lx2/f;->f()V

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Lcom/google/android/gms/common/api/internal/c;->a()V

    .line 7
    invoke-static {}, Lcom/google/android/gms/common/api/internal/d;->a()Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/google/android/gms/common/Feature;

    sget-object v3, Lp3/b0;->b:Lcom/google/android/gms/common/Feature;

    aput-object v3, v1, v2

    .line 8
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/d$a;->d([Lcom/google/android/gms/common/Feature;)Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object v0

    new-instance v1, Lp3/r;

    invoke-direct {v1, p0}, Lp3/r;-><init>(Lp3/z;)V

    .line 9
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/d$a;->b(Ly2/k;)Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object v0

    .line 10
    invoke-virtual {v0, v2}, Lcom/google/android/gms/common/api/internal/d$a;->c(Z)Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object v0

    const/16 v1, 0x612

    .line 11
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/d$a;->e(I)Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/d$a;->a()Lcom/google/android/gms/common/api/internal/d;

    move-result-object v0

    .line 13
    invoke-virtual {p0, v0}, Lx2/e;->p(Lcom/google/android/gms/common/api/internal/d;)Lg4/l;

    move-result-object v0

    return-object v0
.end method

.method public final e(Landroid/content/Intent;)Lcom/google/android/gms/auth/api/identity/SignInCredential;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lx2/b;
        }
    .end annotation

    if-eqz p1, :cond_3

    .line 1
    sget-object v0, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v1, "status"

    .line 2
    invoke-static {p1, v1, v0}, La3/c;->b(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/Status;

    if-eqz v0, :cond_2

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->B()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4
    sget-object v0, Lcom/google/android/gms/auth/api/identity/SignInCredential;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v1, "sign_in_credential"

    .line 5
    invoke-static {p1, v1, v0}, La3/c;->b(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/auth/api/identity/SignInCredential;

    if-eqz p1, :cond_0

    return-object p1

    .line 6
    :cond_0
    new-instance p1, Lx2/b;

    sget-object v0, Lcom/google/android/gms/common/api/Status;->v:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p1, v0}, Lx2/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1

    .line 7
    :cond_1
    new-instance p1, Lx2/b;

    invoke-direct {p1, v0}, Lx2/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1

    .line 8
    :cond_2
    new-instance p1, Lx2/b;

    sget-object v0, Lcom/google/android/gms/common/api/Status;->x:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p1, v0}, Lx2/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1

    .line 9
    :cond_3
    new-instance p1, Lx2/b;

    sget-object v0, Lcom/google/android/gms/common/api/Status;->v:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p1, v0}, Lx2/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1
.end method

.method public final f(Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;)Lg4/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;",
            ")",
            "Lg4/l<",
            "Lcom/google/android/gms/auth/api/identity/BeginSignInResult;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-static {p1}, Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;->D(Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$a;

    move-result-object p1

    iget-object v0, p0, Lp3/z;->k:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$a;->g(Ljava/lang/String;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$a;

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$a;->a()Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;

    move-result-object p1

    .line 3
    invoke-static {}, Lcom/google/android/gms/common/api/internal/d;->a()Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/google/android/gms/common/Feature;

    sget-object v2, Lp3/b0;->a:Lcom/google/android/gms/common/Feature;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/d$a;->d([Lcom/google/android/gms/common/Feature;)Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object v0

    new-instance v1, Lp3/p;

    invoke-direct {v1, p0, p1}, Lp3/p;-><init>(Lp3/z;Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;)V

    .line 5
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/d$a;->b(Ly2/k;)Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object p1

    .line 6
    invoke-virtual {p1, v3}, Lcom/google/android/gms/common/api/internal/d$a;->c(Z)Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object p1

    const/16 v0, 0x611

    .line 7
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/d$a;->e(I)Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object p1

    .line 8
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/d$a;->a()Lcom/google/android/gms/common/api/internal/d;

    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lx2/e;->n(Lcom/google/android/gms/common/api/internal/d;)Lg4/l;

    move-result-object p1

    return-object p1
.end method

.method public final i(Landroid/content/Intent;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lx2/b;
        }
    .end annotation

    if-eqz p1, :cond_3

    .line 1
    sget-object v0, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v1, "status"

    .line 2
    invoke-static {p1, v1, v0}, La3/c;->b(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/Status;

    if-eqz v0, :cond_2

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->B()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "phone_number_hint_result"

    .line 4
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    .line 5
    :cond_0
    new-instance p1, Lx2/b;

    sget-object v0, Lcom/google/android/gms/common/api/Status;->v:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p1, v0}, Lx2/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1

    .line 6
    :cond_1
    new-instance p1, Lx2/b;

    invoke-direct {p1, v0}, Lx2/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1

    .line 7
    :cond_2
    new-instance p1, Lx2/b;

    sget-object v0, Lcom/google/android/gms/common/api/Status;->x:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p1, v0}, Lx2/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1

    .line 8
    :cond_3
    new-instance p1, Lx2/b;

    sget-object v0, Lcom/google/android/gms/common/api/Status;->v:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p1, v0}, Lx2/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1
.end method

.method final synthetic y(Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest;Lp3/a0;Lg4/m;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    new-instance v0, Lp3/y;

    invoke-direct {v0, p0, p3}, Lp3/y;-><init>(Lp3/z;Lg4/m;)V

    .line 2
    invoke-virtual {p2}, Lcom/google/android/gms/common/internal/b;->D()Landroid/os/IInterface;

    move-result-object p2

    check-cast p2, Lp3/k;

    iget-object p3, p0, Lp3/z;->k:Ljava/lang/String;

    .line 3
    invoke-virtual {p2, v0, p1, p3}, Lp3/k;->J0(Lp3/f;Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest;Ljava/lang/String;)V

    return-void
.end method

.method final synthetic z(Lp3/a0;Lg4/m;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    new-instance v0, Lp3/w;

    invoke-direct {v0, p0, p2}, Lp3/w;-><init>(Lp3/z;Lg4/m;)V

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/b;->D()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lp3/k;

    iget-object p2, p0, Lp3/z;->k:Ljava/lang/String;

    invoke-virtual {p1, v0, p2}, Lp3/k;->L0(Ly2/e;Ljava/lang/String;)V

    return-void
.end method
