.class public Lc8/b;
.super Lc8/a;
.source "SourceFile"


# instance fields
.field private n:Lu6/c;


# direct methods
.method public constructor <init>(Lu6/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc8/a;-><init>()V

    .line 2
    iput-object p1, p0, Lc8/b;->n:Lu6/c;

    return-void
.end method


# virtual methods
.method public getColumnNames()[Ljava/lang/String;
    .locals 8

    const-string v0, "channel_param"

    const-string v1, "default_channel_param"

    const-string v2, "base_url_param"

    const-string v3, "default_base_url_param"

    const-string v4, "settings_param"

    const-string v5, "user_agent_param"

    const-string v6, "default_user_agent_param"

    const-string v7, "dev_rpc_ip_port_override"

    filled-new-array/range {v0 .. v7}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getString(I)Ljava/lang/String;
    .locals 1

    const-string v0, "channel_param"

    .line 1
    invoke-virtual {p0, v0}, Landroid/database/AbstractCursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-ne p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lc8/b;->n:Lu6/c;

    invoke-virtual {p1}, Lu6/c;->f()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "default_channel_param"

    .line 3
    invoke-virtual {p0, v0}, Landroid/database/AbstractCursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-ne p1, v0, :cond_1

    .line 4
    iget-object p1, p0, Lc8/b;->n:Lu6/c;

    invoke-virtual {p1}, Lu6/c;->c()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const-string v0, "base_url_param"

    .line 5
    invoke-virtual {p0, v0}, Landroid/database/AbstractCursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-ne p1, v0, :cond_2

    .line 6
    iget-object p1, p0, Lc8/b;->n:Lu6/c;

    invoke-virtual {p1}, Lu6/c;->a()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    const-string v0, "default_base_url_param"

    .line 7
    invoke-virtual {p0, v0}, Landroid/database/AbstractCursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-ne p1, v0, :cond_3

    .line 8
    iget-object p1, p0, Lc8/b;->n:Lu6/c;

    invoke-virtual {p1}, Lu6/c;->b()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    const-string v0, "settings_param"

    .line 9
    invoke-virtual {p0, v0}, Landroid/database/AbstractCursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-ne p1, v0, :cond_4

    .line 10
    iget-object p1, p0, Lc8/b;->n:Lu6/c;

    invoke-virtual {p1}, Lu6/c;->h()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_4
    const-string v0, "user_agent_param"

    .line 11
    invoke-virtual {p0, v0}, Landroid/database/AbstractCursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-ne p1, v0, :cond_5

    .line 12
    iget-object p1, p0, Lc8/b;->n:Lu6/c;

    invoke-virtual {p1}, Lu6/c;->i()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_5
    const-string v0, "default_user_agent_param"

    .line 13
    invoke-virtual {p0, v0}, Landroid/database/AbstractCursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-ne p1, v0, :cond_6

    .line 14
    iget-object p1, p0, Lc8/b;->n:Lu6/c;

    invoke-virtual {p1}, Lu6/c;->d()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_6
    const-string v0, "dev_rpc_ip_port_override"

    .line 15
    invoke-virtual {p0, v0}, Landroid/database/AbstractCursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-ne p1, v0, :cond_7

    .line 16
    iget-object p1, p0, Lc8/b;->n:Lu6/c;

    invoke-virtual {p1}, Lu6/c;->e()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_7
    const/4 p1, 0x0

    return-object p1
.end method
