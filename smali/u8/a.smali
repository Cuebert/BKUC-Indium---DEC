.class public Lu8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv6/a;


# instance fields
.field private a:Lp2/e;

.field private b:Lv6/b;

.field c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lv6/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lp2/f$a;

    invoke-direct {v0}, Lp2/f$a;-><init>()V

    .line 3
    invoke-virtual {v0}, Lp2/f$a;->c()Lp2/f$a;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lp2/f$a;->b()Lp2/f;

    move-result-object v0

    .line 5
    invoke-static {p1, v0}, Lp2/c;->a(Landroid/app/Activity;Lp2/f;)Lp2/e;

    move-result-object p1

    iput-object p1, p0, Lu8/a;->a:Lp2/e;

    .line 6
    iput-object p2, p0, Lu8/a;->b:Lv6/b;

    .line 7
    new-instance p1, Ljava/lang/ref/WeakReference;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lu8/a;->c:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method static synthetic i(Lu8/a;)Lv6/b;
    .locals 0

    iget-object p0, p0, Lu8/a;->b:Lv6/b;

    return-object p0
.end method

.method static synthetic j(Lu8/a;Lcom/google/android/gms/auth/api/credentials/Credential;)Lv6/d;
    .locals 0

    invoke-direct {p0, p1}, Lu8/a;->k(Lcom/google/android/gms/auth/api/credentials/Credential;)Lv6/d;

    move-result-object p0

    return-object p0
.end method

.method private k(Lcom/google/android/gms/auth/api/credentials/Credential;)Lv6/d;
    .locals 3

    new-instance v0, Lv6/d;

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/credentials/Credential;->A()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/credentials/Credential;->D()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/credentials/Credential;->C()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lv6/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private l(Lv6/d;)Lcom/google/android/gms/auth/api/credentials/Credential;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/auth/api/credentials/Credential$a;

    iget-object v1, p1, Lv6/d;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/google/android/gms/auth/api/credentials/Credential$a;-><init>(Ljava/lang/String;)V

    iget-object v1, p1, Lv6/d;->c:Ljava/lang/String;

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/gms/auth/api/credentials/Credential$a;->b(Ljava/lang/String;)Lcom/google/android/gms/auth/api/credentials/Credential$a;

    move-result-object v0

    iget-object p1, p1, Lv6/d;->b:Ljava/lang/String;

    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/auth/api/credentials/Credential$a;->c(Ljava/lang/String;)Lcom/google/android/gms/auth/api/credentials/Credential$a;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/credentials/Credential$a;->a()Lcom/google/android/gms/auth/api/credentials/Credential;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lu8/a;->b:Lv6/b;

    const-string v1, "credentialSaved"

    invoke-virtual {v0, v1}, Lv6/b;->a(Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lu8/a;->b:Lv6/b;

    const-string v1, "dialogDismissed"

    invoke-virtual {v0, v1}, Lv6/b;->c(Ljava/lang/String;)V

    return-void
.end method

.method public c(Landroid/app/Activity;ILv6/a$b;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/auth/api/credentials/CredentialRequest$a;

    invoke-direct {v0}, Lcom/google/android/gms/auth/api/credentials/CredentialRequest$a;-><init>()V

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/gms/auth/api/credentials/CredentialRequest$a;->b(Z)Lcom/google/android/gms/auth/api/credentials/CredentialRequest$a;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/credentials/CredentialRequest$a;->a()Lcom/google/android/gms/auth/api/credentials/CredentialRequest;

    move-result-object v0

    .line 4
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lu8/a;->c:Ljava/lang/ref/WeakReference;

    .line 5
    iget-object p1, p0, Lu8/a;->a:Lp2/e;

    invoke-virtual {p1, v0}, Lp2/e;->z(Lcom/google/android/gms/auth/api/credentials/CredentialRequest;)Lg4/l;

    move-result-object p1

    new-instance v0, Lu8/a$b;

    invoke-direct {v0, p0, p3, p2}, Lu8/a$b;-><init>(Lu8/a;Lv6/a$b;I)V

    invoke-virtual {p1, v0}, Lg4/l;->b(Lg4/f;)Lg4/l;

    return-void
.end method

.method public d(Lv6/d;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lu8/a;->l(Lv6/d;)Lcom/google/android/gms/auth/api/credentials/Credential;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lu8/a;->a:Lp2/e;

    invoke-virtual {v0, p1}, Lp2/e;->y(Lcom/google/android/gms/auth/api/credentials/Credential;)Lg4/l;

    move-result-object p1

    new-instance v0, Lu8/a$c;

    invoke-direct {v0, p0}, Lu8/a$c;-><init>(Lu8/a;)V

    invoke-virtual {p1, v0}, Lg4/l;->b(Lg4/f;)Lg4/l;

    return-void
.end method

.method public e()V
    .locals 3

    iget-object v0, p0, Lu8/a;->b:Lv6/b;

    const-string v1, "credentialNotSaved"

    const-string v2, "neverClickedOrDialogDismissed"

    invoke-virtual {v0, v1, v2}, Lv6/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public f(Landroid/app/Activity;ILv6/d;Lv6/a$a;)V
    .locals 2

    const-string v0, "SmartLockManager"

    const-string v1, "saveCredential."

    .line 1
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lu8/a;->c:Ljava/lang/ref/WeakReference;

    .line 3
    iget-object p1, p0, Lu8/a;->a:Lp2/e;

    invoke-direct {p0, p3}, Lu8/a;->l(Lv6/d;)Lcom/google/android/gms/auth/api/credentials/Credential;

    move-result-object p3

    invoke-virtual {p1, p3}, Lp2/e;->A(Lcom/google/android/gms/auth/api/credentials/Credential;)Lg4/l;

    move-result-object p1

    new-instance p3, Lu8/a$a;

    invoke-direct {p3, p0, p4, p2}, Lu8/a$a;-><init>(Lu8/a;Lv6/a$a;I)V

    invoke-virtual {p1, p3}, Lg4/l;->b(Lg4/f;)Lg4/l;

    return-void
.end method

.method public g(Landroid/content/Intent;)Lv6/d;
    .locals 1

    const-string v0, "com.google.android.gms.credentials.Credential"

    .line 1
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/auth/api/credentials/Credential;

    .line 2
    invoke-direct {p0, p1}, Lu8/a;->k(Lcom/google/android/gms/auth/api/credentials/Credential;)Lv6/d;

    move-result-object p1

    return-object p1
.end method

.method public h()V
    .locals 2

    iget-object v0, p0, Lu8/a;->b:Lv6/b;

    const-string v1, "credentialSelected"

    invoke-virtual {v0, v1}, Lv6/b;->c(Ljava/lang/String;)V

    return-void
.end method
