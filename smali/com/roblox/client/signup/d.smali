.class public abstract Lcom/roblox/client/signup/d;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/signup/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Lcom/roblox/client/signup/f;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private final k:Z

.field protected l:Ljava/lang/String;

.field protected m:Ljava/lang/String;

.field protected n:I

.field protected o:I

.field protected p:I

.field protected q:I

.field protected r:Ljava/lang/String;

.field protected s:Ljava/lang/String;

.field protected t:Ljava/lang/String;

.field protected u:Lcom/roblox/client/signup/d$a;


# direct methods
.method public constructor <init>(IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roblox/client/signup/d$a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const-string v0, "Z^#q"

    .line 2
    iput-object v0, p0, Lcom/roblox/client/signup/d;->a:Ljava/lang/String;

    const-string v0, "Fu.*mJ"

    .line 3
    iput-object v0, p0, Lcom/roblox/client/signup/d;->b:Ljava/lang/String;

    const-string v0, "l%=f~RIW"

    .line 4
    iput-object v0, p0, Lcom/roblox/client/signup/d;->c:Ljava/lang/String;

    const-string v0, "L65HQ,v?K"

    .line 5
    iput-object v0, p0, Lcom/roblox/client/signup/d;->d:Ljava/lang/String;

    const-string v0, "hC39$"

    .line 6
    iput-object v0, p0, Lcom/roblox/client/signup/d;->e:Ljava/lang/String;

    const-string v0, "qb@Wl"

    .line 7
    iput-object v0, p0, Lcom/roblox/client/signup/d;->f:Ljava/lang/String;

    const-string v0, "Av=M"

    .line 8
    iput-object v0, p0, Lcom/roblox/client/signup/d;->g:Ljava/lang/String;

    const-string v0, "B7YpO"

    .line 9
    iput-object v0, p0, Lcom/roblox/client/signup/d;->h:Ljava/lang/String;

    const-string v0, "jEda0J~i"

    .line 10
    iput-object v0, p0, Lcom/roblox/client/signup/d;->i:Ljava/lang/String;

    const-string v0, "HZmfcyG9,F"

    .line 11
    iput-object v0, p0, Lcom/roblox/client/signup/d;->j:Ljava/lang/String;

    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lcom/roblox/client/signup/d;->k:Z

    .line 13
    iput-object p10, p0, Lcom/roblox/client/signup/d;->u:Lcom/roblox/client/signup/d$a;

    .line 14
    iput-object p6, p0, Lcom/roblox/client/signup/d;->l:Ljava/lang/String;

    .line 15
    iput-object p7, p0, Lcom/roblox/client/signup/d;->m:Ljava/lang/String;

    .line 16
    iput p1, p0, Lcom/roblox/client/signup/d;->n:I

    .line 17
    iput p2, p0, Lcom/roblox/client/signup/d;->o:I

    .line 18
    iput p3, p0, Lcom/roblox/client/signup/d;->p:I

    .line 19
    iput p4, p0, Lcom/roblox/client/signup/d;->q:I

    .line 20
    iput-object p5, p0, Lcom/roblox/client/signup/d;->r:Ljava/lang/String;

    .line 21
    iput-object p8, p0, Lcom/roblox/client/signup/d;->s:Ljava/lang/String;

    .line 22
    iput-object p9, p0, Lcom/roblox/client/signup/d;->t:Ljava/lang/String;

    return-void
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    const-string v0, "SHA-256"

    .line 1
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Ljava/security/MessageDigest;->reset()V

    const-string v1, "UTF-8"

    .line 3
    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p1

    .line 4
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v1, 0x0

    .line 5
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    .line 6
    aget-byte v2, p1, v1

    and-int/lit16 v2, v2, 0xff

    add-int/lit16 v2, v2, 0x100

    const/16 v3, 0x10

    invoke-static {v2, v3}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static d(III)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x1

    add-int/2addr p0, v0

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v1, v0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 p1, 0x2

    aput-object p0, v1, p1

    const-string p0, "%d/%d/%d"

    invoke-static {p0, v1}, Lc9/q;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private g()Lcom/roblox/client/signup/f;
    .locals 3

    .line 1
    new-instance v0, Lcom/roblox/client/signup/f;

    invoke-direct {v0}, Lcom/roblox/client/signup/f;-><init>()V

    .line 2
    iget-object v1, v0, Lcom/roblox/client/signup/f;->a:Ljava/util/ArrayList;

    const-string v2, "PasswordInvalid"

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method


# virtual methods
.method protected varargs b([Ljava/lang/Void;)Lcom/roblox/client/signup/f;
    .locals 7

    .line 1
    iget-object p1, p0, Lcom/roblox/client/signup/d;->m:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/roblox/client/signup/d;->g()Lcom/roblox/client/signup/f;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/roblox/client/signup/d;->l:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/roblox/client/signup/d;->f(Ljava/lang/String;)[Lh7/b$a;

    move-result-object v6

    .line 4
    iget-object v1, p0, Lcom/roblox/client/signup/d;->l:Ljava/lang/String;

    iget-object v2, p0, Lcom/roblox/client/signup/d;->m:Ljava/lang/String;

    iget-object v3, p0, Lcom/roblox/client/signup/d;->r:Ljava/lang/String;

    iget-object v4, p0, Lcom/roblox/client/signup/d;->s:Ljava/lang/String;

    iget-object v5, p0, Lcom/roblox/client/signup/d;->t:Ljava/lang/String;

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/roblox/client/signup/d;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lh7/b$a;)Lcom/roblox/client/signup/f;

    move-result-object p1

    return-object p1
.end method

.method protected abstract c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lh7/b$a;)Lcom/roblox/client/signup/f;
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/roblox/client/signup/d;->b([Ljava/lang/Void;)Lcom/roblox/client/signup/f;

    move-result-object p1

    return-object p1
.end method

.method protected e()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lcom/roblox/client/signup/d;->n:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const-string v0, "Male"

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    const-string v0, "Female"

    goto :goto_0

    :cond_1
    const-string v0, "Unknown"

    :goto_0
    return-object v0
.end method

.method protected f(Ljava/lang/String;)[Lh7/b$a;
    .locals 3

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-static {}, Lcom/roblox/client/p0;->p0()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roblox/client/signup/d;->i:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/roblox/client/signup/d;->f:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/roblox/client/signup/d;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/roblox/client/signup/d;->j:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/roblox/client/signup/d;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 3
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roblox/client/signup/d;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/roblox/client/signup/d;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/roblox/client/signup/d;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/roblox/client/signup/d;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/roblox/client/signup/d;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 4
    :goto_0
    invoke-direct {p0, p1}, Lcom/roblox/client/signup/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-object p1, v0

    :goto_1
    if-eqz p1, :cond_1

    .line 5
    new-instance v0, Lh7/b$a;

    invoke-direct {v0}, Lh7/b$a;-><init>()V

    const-string v1, "X-RBXUSER-TOKEN"

    .line 6
    iput-object v1, v0, Lh7/b$a;->a:Ljava/lang/String;

    .line 7
    iput-object p1, v0, Lh7/b$a;->b:Ljava/lang/String;

    const/4 p1, 0x1

    new-array p1, p1, [Lh7/b$a;

    const/4 v1, 0x0

    aput-object v0, p1, v1

    move-object v0, p1

    :cond_1
    return-object v0
.end method

.method protected h(Lcom/roblox/client/signup/f;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/signup/d;->u:Lcom/roblox/client/signup/d$a;

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {p1}, Lcom/roblox/client/signup/f;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/roblox/client/signup/d;->u:Lcom/roblox/client/signup/d$a;

    invoke-interface {v0, p1}, Lcom/roblox/client/signup/d$a;->a(Lcom/roblox/client/signup/f;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/signup/d;->u:Lcom/roblox/client/signup/d$a;

    invoke-interface {v0, p1}, Lcom/roblox/client/signup/d$a;->b(Lcom/roblox/client/signup/f;)V

    :cond_1
    :goto_0
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/roblox/client/signup/f;

    invoke-virtual {p0, p1}, Lcom/roblox/client/signup/d;->h(Lcom/roblox/client/signup/f;)V

    return-void
.end method
