.class Le8/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le8/j;->b(Ljava/lang/String;Li7/c;Le8/j$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Le8/j$c;

.field final synthetic b:Le8/j;


# direct methods
.method constructor <init>(Le8/j;Le8/j$c;)V
    .locals 0

    iput-object p1, p0, Le8/j$a;->b:Le8/j;

    iput-object p2, p0, Le8/j$a;->a:Le8/j$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lh7/j;)V
    .locals 0

    return-void
.end method

.method public b(Lh7/j;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lh7/j;->a()Ljava/lang/String;

    move-result-object v0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Verify Purchase callback. response code "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lh7/j;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " responseBody = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.purchaseflow"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-virtual {p1}, Lh7/j;->b()I

    move-result p1

    const/16 v0, 0xc8

    if-eq p1, v0, :cond_3

    const/16 v0, 0x1f4

    if-eq p1, v0, :cond_2

    const/16 v0, 0x190

    if-eq p1, v0, :cond_1

    const/16 v0, 0x191

    if-eq p1, v0, :cond_0

    const-string p1, "Unknown"

    .line 4
    invoke-static {v1, p1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    sget-object p1, Le8/j$b;->r:Le8/j$b;

    .line 6
    iget-object v0, p0, Le8/j$a;->b:Le8/j;

    invoke-static {v0}, Le8/j;->a(Le8/j;)Lx7/e;

    move-result-object v0

    invoke-virtual {v0}, Lx7/e;->T()V

    goto :goto_0

    :cond_0
    const-string p1, "Unauthorized to make request."

    .line 7
    invoke-static {v1, p1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    sget-object p1, Le8/j$b;->p:Le8/j$b;

    .line 9
    iget-object v0, p0, Le8/j$a;->b:Le8/j;

    invoke-static {v0}, Le8/j;->a(Le8/j;)Lx7/e;

    move-result-object v0

    invoke-virtual {v0}, Lx7/e;->R()V

    goto :goto_0

    :cond_1
    const-string p1, "Service was unable to validate receiptId."

    .line 10
    invoke-static {v1, p1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    sget-object p1, Le8/j$b;->o:Le8/j$b;

    .line 12
    iget-object v0, p0, Le8/j$a;->b:Le8/j;

    invoke-static {v0}, Le8/j;->a(Le8/j;)Lx7/e;

    move-result-object v0

    invoke-virtual {v0}, Lx7/e;->Q()V

    goto :goto_0

    :cond_2
    const-string p1, "Server error"

    .line 13
    invoke-static {v1, p1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    sget-object p1, Le8/j$b;->r:Le8/j$b;

    .line 15
    iget-object v0, p0, Le8/j$a;->b:Le8/j;

    invoke-static {v0}, Le8/j;->a(Le8/j;)Lx7/e;

    move-result-object v0

    invoke-virtual {v0}, Lx7/e;->S()V

    goto :goto_0

    :cond_3
    const-string p1, "Verification success"

    .line 16
    invoke-static {v1, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    sget-object p1, Le8/j$b;->n:Le8/j$b;

    .line 18
    iget-object v0, p0, Le8/j$a;->b:Le8/j;

    invoke-static {v0}, Le8/j;->a(Le8/j;)Lx7/e;

    move-result-object v0

    invoke-virtual {v0}, Lx7/e;->P()V

    .line 19
    :goto_0
    iget-object v0, p0, Le8/j$a;->a:Le8/j$c;

    if-eqz v0, :cond_4

    .line 20
    invoke-interface {v0, p1}, Le8/j$c;->a(Le8/j$b;)V

    :cond_4
    return-void
.end method
