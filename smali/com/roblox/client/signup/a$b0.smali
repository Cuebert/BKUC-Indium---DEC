.class Lcom/roblox/client/signup/a$b0;
.super Landroid/os/AsyncTask;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/signup/a$d0;
.implements Lcom/roblox/client/signup/a$z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/signup/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b0"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;",
        "Lcom/roblox/client/signup/a$d0;",
        "Lcom/roblox/client/signup/a$z;"
    }
.end annotation


# instance fields
.field a:Lcom/roblox/client/signup/a$c0;

.field b:Ljava/lang/String;

.field c:Ljava/lang/String;

.field d:Ljava/lang/String;

.field e:Lorg/json/JSONObject;

.field f:I

.field private g:Lt8/c;

.field private h:Lt8/d;

.field final synthetic i:Lcom/roblox/client/signup/a;


# direct methods
.method constructor <init>(Lcom/roblox/client/signup/a;Lcom/roblox/client/signup/a$c0;)V
    .locals 7

    const-string v0, "UTF-8"

    const-string v1, "signup"

    .line 1
    iput-object p1, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const/4 v2, 0x0

    .line 2
    iput-object v2, p0, Lcom/roblox/client/signup/a$b0;->b:Ljava/lang/String;

    .line 3
    iput-object v2, p0, Lcom/roblox/client/signup/a$b0;->c:Ljava/lang/String;

    .line 4
    iput-object v2, p0, Lcom/roblox/client/signup/a$b0;->d:Ljava/lang/String;

    .line 5
    iput-object v2, p0, Lcom/roblox/client/signup/a$b0;->e:Lorg/json/JSONObject;

    const/4 v2, -0x1

    .line 6
    iput v2, p0, Lcom/roblox/client/signup/a$b0;->f:I

    .line 7
    iput-object p2, p0, Lcom/roblox/client/signup/a$b0;->a:Lcom/roblox/client/signup/a$c0;

    const-string p2, "NotUTF8"

    .line 8
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    :try_start_0
    const-string v5, "username"
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    .line 9
    :try_start_1
    invoke-static {p1}, Lcom/roblox/client/signup/a;->H2(Lcom/roblox/client/signup/a;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, p0, Lcom/roblox/client/signup/a$b0;->b:Ljava/lang/String;
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_2

    :try_start_2
    const-string v5, "password"

    .line 10
    invoke-static {p1}, Lcom/roblox/client/signup/a;->J2(Lcom/roblox/client/signup/a;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/signup/a$b0;->c:Ljava/lang/String;
    :try_end_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    .line 11
    :catch_0
    iget-object v0, p1, Lcom/roblox/client/signup/a;->Z0:Lcom/roblox/client/components/RbxEditText;

    sget v6, Lcom/roblox/client/c0;->P1:I

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v2, v6, v4}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v0, v2}, Lcom/roblox/client/signup/a;->I2(Lcom/roblox/client/signup/a;Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V

    .line 12
    invoke-static {v1, v5, p2, v3}, Lcom/roblox/client/f0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 13
    :goto_0
    new-instance p2, Lt8/a;

    invoke-static {p1}, Lcom/roblox/client/signup/a;->T2(Lcom/roblox/client/signup/a;)Lx7/e;

    move-result-object v0

    invoke-direct {p2, v0, p0}, Lt8/a;-><init>(Lx7/e;Lcom/roblox/client/signup/a$d0;)V

    iput-object p2, p0, Lcom/roblox/client/signup/a$b0;->h:Lt8/d;

    .line 14
    new-instance p2, Lt8/b;

    invoke-static {p1}, Lcom/roblox/client/signup/a;->T2(Lcom/roblox/client/signup/a;)Lx7/e;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Lt8/b;-><init>(Lx7/e;Lcom/roblox/client/signup/a$z;)V

    iput-object p2, p0, Lcom/roblox/client/signup/a$b0;->g:Lt8/c;

    return-void

    :catch_1
    const-string v5, ""

    .line 15
    :catch_2
    invoke-static {p1}, Lcom/roblox/client/signup/a;->E2(Lcom/roblox/client/signup/a;)Lcom/roblox/client/signup/UsernameSignUpEditText;

    move-result-object v0

    sget v6, Lcom/roblox/client/c0;->g2:I

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v2, v6, v4}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v0, v2}, Lcom/roblox/client/signup/a;->I2(Lcom/roblox/client/signup/a;Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V

    .line 16
    invoke-static {v1, v5, p2, v3}, Lcom/roblox/client/f0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method private e()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/signup/a$b0;->a:Lcom/roblox/client/signup/a$c0;

    sget-object v1, Lcom/roblox/client/signup/a$c0;->n:Lcom/roblox/client/signup/a$c0;

    if-ne v0, v1, :cond_0

    const-string v0, "Username"

    goto :goto_0

    :cond_0
    const-string v0, "Password"

    :goto_0
    return-object v0
.end method


# virtual methods
.method public a(Lcom/roblox/client/signup/a$a0;Ljava/lang/Integer;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    invoke-static {v0, p1}, Lcom/roblox/client/signup/a;->C2(Lcom/roblox/client/signup/a;Lcom/roblox/client/signup/a$a0;)Lcom/roblox/client/signup/a$a0;

    .line 2
    sget-object v0, Lcom/roblox/client/signup/a$a0;->o:Lcom/roblox/client/signup/a$a0;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    .line 3
    iget-object p1, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    invoke-static {p1}, Lcom/roblox/client/signup/a;->E2(Lcom/roblox/client/signup/a;)Lcom/roblox/client/signup/UsernameSignUpEditText;

    move-result-object v0

    iget-object v2, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v2, p2, v1}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, p2}, Lcom/roblox/client/signup/a;->V2(Lcom/roblox/client/signup/a;Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    invoke-static {p1}, Lcom/roblox/client/signup/a;->E2(Lcom/roblox/client/signup/a;)Lcom/roblox/client/signup/UsernameSignUpEditText;

    move-result-object p1

    iget-object p2, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    invoke-static {p2}, Lcom/roblox/client/signup/a;->D2(Lcom/roblox/client/signup/a;)Lcom/roblox/client/signup/a$w;

    move-result-object p2

    const-wide/16 v0, 0x7d0

    invoke-virtual {p1, p2, v0, v1}, Landroid/widget/LinearLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 5
    iget-object p1, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    invoke-static {p1}, Lcom/roblox/client/signup/a;->E2(Lcom/roblox/client/signup/a;)Lcom/roblox/client/signup/UsernameSignUpEditText;

    move-result-object p1

    invoke-virtual {p1}, Lcom/roblox/client/signup/UsernameSignUpEditText;->K()V

    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    invoke-static {p1}, Lcom/roblox/client/signup/a;->E2(Lcom/roblox/client/signup/a;)Lcom/roblox/client/signup/UsernameSignUpEditText;

    move-result-object v0

    iget-object v2, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v2, p2, v1}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, p2}, Lcom/roblox/client/signup/a;->I2(Lcom/roblox/client/signup/a;Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V

    .line 7
    iget-object p1, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    invoke-static {p1}, Lcom/roblox/client/signup/a;->E2(Lcom/roblox/client/signup/a;)Lcom/roblox/client/signup/UsernameSignUpEditText;

    move-result-object p1

    invoke-virtual {p1}, Lcom/roblox/client/signup/UsernameSignUpEditText;->H()V

    :goto_0
    return-void
.end method

.method public b(Lcom/roblox/client/signup/a$a0;Ljava/lang/Integer;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    invoke-static {v0, p1}, Lcom/roblox/client/signup/a;->N2(Lcom/roblox/client/signup/a;Lcom/roblox/client/signup/a$a0;)Lcom/roblox/client/signup/a$a0;

    .line 2
    sget-object v0, Lcom/roblox/client/signup/a$a0;->o:Lcom/roblox/client/signup/a$a0;

    if-ne p1, v0, :cond_0

    .line 3
    iget-object p1, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    iget-object p2, p1, Lcom/roblox/client/signup/a;->Z0:Lcom/roblox/client/components/RbxEditText;

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Lcom/roblox/client/signup/a;->V2(Lcom/roblox/client/signup/a;Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    iget-object v0, p1, Lcom/roblox/client/signup/a;->Z0:Lcom/roblox/client/components/RbxEditText;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, p2, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, p2}, Lcom/roblox/client/signup/a;->I2(Lcom/roblox/client/signup/a;Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public c()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    sget-object v1, Lcom/roblox/client/signup/a$a0;->p:Lcom/roblox/client/signup/a$a0;

    invoke-static {v0, v1}, Lcom/roblox/client/signup/a;->C2(Lcom/roblox/client/signup/a;Lcom/roblox/client/signup/a$a0;)Lcom/roblox/client/signup/a$a0;

    .line 2
    iget-object v0, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    invoke-static {v0}, Lcom/roblox/client/signup/a;->E2(Lcom/roblox/client/signup/a;)Lcom/roblox/client/signup/UsernameSignUpEditText;

    move-result-object v1

    iget-object v2, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/roblox/client/c0;->b2:I

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v2, v3, v4}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/roblox/client/signup/a;->I2(Lcom/roblox/client/signup/a;Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    invoke-static {v0}, Lcom/roblox/client/signup/a;->E2(Lcom/roblox/client/signup/a;)Lcom/roblox/client/signup/UsernameSignUpEditText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/signup/UsernameSignUpEditText;->J()V

    return-void
.end method

.method protected varargs d([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 6

    .line 1
    iget-object p1, p0, Lcom/roblox/client/signup/a$b0;->a:Lcom/roblox/client/signup/a$c0;

    sget-object v0, Lcom/roblox/client/signup/a$c0;->n:Lcom/roblox/client/signup/a$c0;

    if-ne p1, v0, :cond_0

    const-string p1, "username"

    goto :goto_0

    :cond_0
    const-string p1, "password"

    .line 2
    :goto_0
    invoke-virtual {p0}, Landroid/os/AsyncTask;->isCancelled()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    return-object v1

    .line 3
    :cond_1
    sget-object v0, Lcom/roblox/client/signup/a$n;->a:[I

    iget-object v2, p0, Lcom/roblox/client/signup/a$b0;->a:Lcom/roblox/client/signup/a$c0;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    goto :goto_1

    .line 4
    :cond_2
    iget-object v0, p0, Lcom/roblox/client/signup/a$b0;->h:Lt8/d;

    iget-object v3, p0, Lcom/roblox/client/signup/a$b0;->b:Ljava/lang/String;

    iget-object v4, p0, Lcom/roblox/client/signup/a$b0;->c:Ljava/lang/String;

    invoke-virtual {v0, v3, v4}, Lt8/d;->a(Ljava/lang/String;Ljava/lang/String;)Lh7/j;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lh7/j;->a()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/roblox/client/signup/a$b0;->d:Ljava/lang/String;

    .line 6
    invoke-virtual {v0}, Lh7/j;->b()I

    move-result v0

    iput v0, p0, Lcom/roblox/client/signup/a$b0;->f:I

    goto :goto_1

    .line 7
    :cond_3
    iget-object v0, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    invoke-static {v0}, Lcom/roblox/client/signup/a;->h3(Lcom/roblox/client/signup/a;)I

    move-result v0

    iget-object v3, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    invoke-static {v3}, Lcom/roblox/client/signup/a;->f3(Lcom/roblox/client/signup/a;)I

    move-result v3

    iget-object v4, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    invoke-static {v4}, Lcom/roblox/client/signup/a;->j3(Lcom/roblox/client/signup/a;)I

    move-result v4

    invoke-static {v0, v3, v4}, Lcom/roblox/client/signup/d;->d(III)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc9/q;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 8
    iget-object v3, p0, Lcom/roblox/client/signup/a$b0;->g:Lt8/c;

    iget-object v4, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    invoke-static {v4}, Lcom/roblox/client/signup/a;->H2(Lcom/roblox/client/signup/a;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "Signup"

    invoke-virtual {v3, v4, v0, v5}, Lt8/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lh7/j;

    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lh7/j;->a()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/roblox/client/signup/a$b0;->d:Ljava/lang/String;

    .line 10
    invoke-virtual {v0}, Lh7/j;->b()I

    move-result v0

    iput v0, p0, Lcom/roblox/client/signup/a$b0;->f:I

    .line 11
    :goto_1
    iget-object v0, p0, Lcom/roblox/client/signup/a$b0;->d:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 12
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    iget-object v3, p0, Lcom/roblox/client/signup/a$b0;->d:Ljava/lang/String;

    invoke-direct {v0, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/roblox/client/signup/a$b0;->e:Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v0, ""

    goto :goto_2

    :catch_0
    const-string v0, "ValidationJSONException"

    goto :goto_2

    :cond_4
    const-string v0, "NoResponse"

    .line 13
    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_5

    const-string v3, "signup"

    .line 14
    invoke-static {v3, p1, v0, v2}, Lcom/roblox/client/f0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_5
    return-object v1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/roblox/client/signup/a$b0;->d([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected f(Ljava/lang/Void;)V
    .locals 8

    .line 1
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 2
    invoke-direct {p0}, Lcom/roblox/client/signup/a$b0;->e()Ljava/lang/String;

    .line 3
    iget-object p1, p0, Lcom/roblox/client/signup/a$b0;->a:Lcom/roblox/client/signup/a$c0;

    sget-object v0, Lcom/roblox/client/signup/a$c0;->n:Lcom/roblox/client/signup/a$c0;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    invoke-static {p1}, Lcom/roblox/client/signup/a;->U2(Lcom/roblox/client/signup/a;)Lcom/roblox/client/signup/a$b0;

    move-result-object p1

    if-eq p0, p1, :cond_0

    return-void

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/roblox/client/signup/a$b0;->a:Lcom/roblox/client/signup/a$c0;

    if-ne p1, v0, :cond_1

    const-string p1, "username"

    goto :goto_0

    :cond_1
    const-string p1, "password"

    .line 5
    :goto_0
    iget-object v1, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v1

    const-string v2, "signup"

    const/4 v3, 0x1

    if-nez v1, :cond_2

    const-string v0, "WindowClosed"

    .line 6
    invoke-static {v2, p1, v0, v3}, Lcom/roblox/client/f0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    .line 7
    :cond_2
    iget-object v4, p0, Lcom/roblox/client/signup/a$b0;->d:Ljava/lang/String;

    const/4 v5, 0x0

    const-string v6, ""

    if-nez v4, :cond_5

    .line 8
    iget-object v4, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    invoke-virtual {v4}, Lcom/roblox/client/m0;->q2()Z

    move-result v4

    if-nez v4, :cond_3

    .line 9
    iget-object v4, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    sget v7, Lcom/roblox/client/c0;->K1:I

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v1, v7, v5}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/roblox/client/m0;->t2(Ljava/lang/String;)V

    .line 10
    :cond_3
    iget-object v1, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    invoke-static {v1}, Lcom/roblox/client/signup/a;->T2(Lcom/roblox/client/signup/a;)Lx7/e;

    move-result-object v1

    iget-object v4, p0, Lcom/roblox/client/signup/a$b0;->a:Lcom/roblox/client/signup/a$c0;

    if-ne v4, v0, :cond_4

    const-string v4, "Android-AppSignup-Validation-UsernameResponseNull"

    goto :goto_1

    :cond_4
    const-string v4, "Android-AppSignup-Validation-PasswordResponseNull"

    :goto_1
    invoke-virtual {v1, v4}, Lx7/e;->A(Ljava/lang/String;)V

    const-string v1, "NoResponse"

    goto :goto_3

    .line 11
    :cond_5
    iget-object v4, p0, Lcom/roblox/client/signup/a$b0;->e:Lorg/json/JSONObject;

    if-nez v4, :cond_7

    .line 12
    iget-object v4, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    sget v7, Lcom/roblox/client/c0;->K1:I

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v1, v7, v5}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/roblox/client/m0;->t2(Ljava/lang/String;)V

    .line 13
    iget-object v1, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    invoke-static {v1}, Lcom/roblox/client/signup/a;->T2(Lcom/roblox/client/signup/a;)Lx7/e;

    move-result-object v1

    iget-object v4, p0, Lcom/roblox/client/signup/a$b0;->a:Lcom/roblox/client/signup/a$c0;

    if-ne v4, v0, :cond_6

    const-string v4, "Android-AppSignup-Validation-UsernameJsonNull"

    goto :goto_2

    :cond_6
    const-string v4, "Android-AppSignup-Validation-PasswordJsonNull"

    :goto_2
    invoke-virtual {v1, v4}, Lx7/e;->A(Ljava/lang/String;)V

    const-string v1, "JSONParseFailure"

    goto :goto_3

    :cond_7
    move-object v1, v6

    .line 14
    :goto_3
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_9

    .line 15
    iget-object v4, p0, Lcom/roblox/client/signup/a$b0;->a:Lcom/roblox/client/signup/a$c0;

    if-ne v4, v0, :cond_8

    .line 16
    iget-object v0, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    sget-object v4, Lcom/roblox/client/signup/a$a0;->o:Lcom/roblox/client/signup/a$a0;

    invoke-static {v0, v4}, Lcom/roblox/client/signup/a;->C2(Lcom/roblox/client/signup/a;Lcom/roblox/client/signup/a$a0;)Lcom/roblox/client/signup/a$a0;

    .line 17
    iget-object v0, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    invoke-static {v0}, Lcom/roblox/client/signup/a;->E2(Lcom/roblox/client/signup/a;)Lcom/roblox/client/signup/UsernameSignUpEditText;

    move-result-object v4

    invoke-static {v0, v4, v6}, Lcom/roblox/client/signup/a;->I2(Lcom/roblox/client/signup/a;Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V

    .line 18
    :cond_8
    invoke-static {v2, p1, v1, v3}, Lcom/roblox/client/f0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    .line 19
    :cond_9
    sget-object v0, Lcom/roblox/client/signup/a$n;->a:[I

    iget-object v4, p0, Lcom/roblox/client/signup/a$b0;->a:Lcom/roblox/client/signup/a$c0;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v0, v0, v4

    if-eq v0, v3, :cond_b

    const/4 v4, 0x2

    if-eq v0, v4, :cond_a

    goto :goto_4

    .line 20
    :cond_a
    iget-object v0, p0, Lcom/roblox/client/signup/a$b0;->h:Lt8/d;

    iget v1, p0, Lcom/roblox/client/signup/a$b0;->f:I

    iget-object v4, p0, Lcom/roblox/client/signup/a$b0;->e:Lorg/json/JSONObject;

    invoke-virtual {v0, v1, v4}, Lt8/d;->b(ILorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    .line 21
    iget-object v0, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    invoke-static {v0}, Lcom/roblox/client/signup/a;->K2(Lcom/roblox/client/signup/a;)Z

    goto :goto_4

    .line 22
    :cond_b
    iget-object v0, p0, Lcom/roblox/client/signup/a$b0;->g:Lt8/c;

    iget v1, p0, Lcom/roblox/client/signup/a$b0;->f:I

    iget-object v4, p0, Lcom/roblox/client/signup/a$b0;->e:Lorg/json/JSONObject;

    invoke-virtual {v0, v1, v4}, Lt8/c;->b(ILorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    .line 23
    iget-object v0, p0, Lcom/roblox/client/signup/a$b0;->i:Lcom/roblox/client/signup/a;

    invoke-static {v0}, Lcom/roblox/client/signup/a;->K2(Lcom/roblox/client/signup/a;)Z

    .line 24
    :goto_4
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 25
    invoke-static {v2, p1, v3}, Lcom/roblox/client/f0;->k(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_5

    .line 26
    :cond_c
    invoke-static {v2, p1, v1, v3}, Lcom/roblox/client/f0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    :goto_5
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/roblox/client/signup/a$b0;->f(Ljava/lang/Void;)V

    return-void
.end method
