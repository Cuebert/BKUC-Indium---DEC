.class Le8/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le8/e;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le8/e$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Le8/e$d;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Le8/e;


# direct methods
.method constructor <init>(Le8/e;Le8/e$d;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Le8/e$a;->c:Le8/e;

    iput-object p2, p0, Le8/e$a;->a:Le8/e$d;

    iput-object p3, p0, Le8/e$a;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lh7/j;)V
    .locals 0

    return-void
.end method

.method public b(Lh7/j;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lh7/j;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.purchaseflow"

    if-eqz v0, :cond_0

    .line 2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "response Str "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "response Code "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lh7/j;->b()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    :cond_0
    invoke-virtual {p1}, Lh7/j;->b()I

    move-result p1

    const/16 v2, 0xc8

    if-eq p1, v2, :cond_a

    const/16 v2, 0x1ad

    if-eq p1, v2, :cond_7

    const/16 v0, 0x1f4

    if-eq p1, v0, :cond_6

    const/16 v0, 0x1f7

    if-eq p1, v0, :cond_5

    const/16 v0, 0x190

    if-eq p1, v0, :cond_4

    const/16 v0, 0x191

    if-eq p1, v0, :cond_3

    const/16 v0, 0x193

    if-eq p1, v0, :cond_2

    const/16 v0, 0x194

    if-eq p1, v0, :cond_1

    const-string p1, "Validation unknown error"

    .line 5
    invoke-static {v1, p1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    sget-object p1, Le8/e$c;->t:Le8/e$c;

    .line 7
    iget-object v0, p0, Le8/e$a;->c:Le8/e;

    invoke-static {v0}, Le8/e;->a(Le8/e;)Lx7/e;

    move-result-object v0

    invoke-virtual {v0}, Lx7/e;->N()V

    goto/16 :goto_0

    :cond_1
    const-string p1, "{validateModel} is invalid."

    .line 8
    invoke-static {v1, p1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    sget-object p1, Le8/e$c;->o:Le8/e$c;

    .line 10
    iget-object v0, p0, Le8/e$a;->c:Le8/e;

    invoke-static {v0}, Le8/e;->a(Le8/e;)Lx7/e;

    move-result-object v0

    invoke-virtual {v0}, Lx7/e;->J()V

    goto/16 :goto_0

    :cond_2
    const-string p1, "Unauthorized to make request. XSRF token is needed."

    .line 11
    invoke-static {v1, p1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    sget-object p1, Le8/e$c;->o:Le8/e$c;

    .line 13
    iget-object v0, p0, Le8/e$a;->c:Le8/e;

    invoke-static {v0}, Le8/e;->a(Le8/e;)Lx7/e;

    move-result-object v0

    invoke-virtual {v0}, Lx7/e;->I()V

    goto/16 :goto_0

    :cond_3
    const-string p1, "Unauthorized to make request. Auth cookie is needed."

    .line 14
    invoke-static {v1, p1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    sget-object p1, Le8/e$c;->o:Le8/e$c;

    .line 16
    iget-object v0, p0, Le8/e$a;->c:Le8/e;

    invoke-static {v0}, Le8/e;->a(Le8/e;)Lx7/e;

    move-result-object v0

    invoke-virtual {v0}, Lx7/e;->H()V

    goto/16 :goto_0

    :cond_4
    const-string p1, "Service has thrown an uknown exception."

    .line 17
    invoke-static {v1, p1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    sget-object p1, Le8/e$c;->t:Le8/e$c;

    .line 19
    iget-object v0, p0, Le8/e$a;->c:Le8/e;

    invoke-static {v0}, Le8/e;->a(Le8/e;)Lx7/e;

    move-result-object v0

    invoke-virtual {v0}, Lx7/e;->G()V

    goto :goto_0

    :cond_5
    const-string p1, "Service has been turned off. Header response will include Retry-After in seconds."

    .line 20
    invoke-static {v1, p1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    sget-object p1, Le8/e$c;->p:Le8/e$c;

    .line 22
    iget-object v0, p0, Le8/e$a;->c:Le8/e;

    invoke-static {v0}, Le8/e;->a(Le8/e;)Lx7/e;

    move-result-object v0

    invoke-virtual {v0}, Lx7/e;->M()V

    goto :goto_0

    :cond_6
    const-string p1, "Server Error"

    .line 23
    invoke-static {v1, p1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    sget-object p1, Le8/e$c;->t:Le8/e$c;

    .line 25
    iget-object v0, p0, Le8/e$a;->c:Le8/e;

    invoke-static {v0}, Le8/e;->a(Le8/e;)Lx7/e;

    move-result-object v0

    invoke-virtual {v0}, Lx7/e;->L()V

    goto :goto_0

    :cond_7
    const-string p1, "Service has been rate limited to user."

    .line 26
    invoke-static {v1, p1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    iget-object p1, p0, Le8/e$a;->c:Le8/e;

    invoke-static {p1}, Le8/e;->a(Le8/e;)Lx7/e;

    move-result-object p1

    invoke-virtual {p1}, Lx7/e;->K()V

    .line 28
    :try_start_0
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "errors"

    .line 29
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    const/4 v0, 0x0

    .line 30
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "code"

    .line 31
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    const/4 v0, 0x7

    if-eq p1, v0, :cond_8

    const/4 v0, 0x6

    if-ne p1, v0, :cond_9

    .line 32
    :cond_8
    sget-object p1, Le8/e$c;->r:Le8/e$c;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 33
    :catch_0
    :cond_9
    sget-object p1, Le8/e$c;->q:Le8/e$c;

    goto :goto_0

    :cond_a
    const-string p1, "Validation successful"

    .line 34
    invoke-static {v1, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    sget-object p1, Le8/e$c;->n:Le8/e$c;

    .line 36
    iget-object v0, p0, Le8/e$a;->c:Le8/e;

    invoke-static {v0}, Le8/e;->a(Le8/e;)Lx7/e;

    move-result-object v0

    invoke-virtual {v0}, Lx7/e;->F()V

    .line 37
    :goto_0
    iget-object v0, p0, Le8/e$a;->a:Le8/e$d;

    if-eqz v0, :cond_b

    .line 38
    iget-object v1, p0, Le8/e$a;->b:Ljava/lang/String;

    invoke-interface {v0, p1, v1}, Le8/e$d;->a(Le8/e$c;Ljava/lang/String;)V

    :cond_b
    return-void
.end method
