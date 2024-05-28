.class Le8/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/g$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le8/e;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le8/e$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Le8/e$d;

.field final synthetic e:Le8/e;


# direct methods
.method constructor <init>(Le8/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le8/e$d;)V
    .locals 0

    iput-object p1, p0, Le8/e$b;->e:Le8/e;

    iput-object p2, p0, Le8/e$b;->a:Ljava/lang/String;

    iput-object p3, p0, Le8/e$b;->b:Ljava/lang/String;

    iput-object p4, p0, Le8/e$b;->c:Ljava/lang/String;

    iput-object p5, p0, Le8/e$b;->d:Le8/e$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ZI)V
    .locals 3

    if-eqz p1, :cond_0

    .line 1
    iget-object p1, p0, Le8/e$b;->e:Le8/e;

    iget-object p2, p0, Le8/e$b;->a:Ljava/lang/String;

    iget-object v0, p0, Le8/e$b;->b:Ljava/lang/String;

    iget-object v1, p0, Le8/e$b;->c:Ljava/lang/String;

    iget-object v2, p0, Le8/e$b;->d:Le8/e$d;

    invoke-virtual {p1, p2, v0, v1, v2}, Le8/e;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le8/e$d;)V

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Le8/e$b;->d:Le8/e$d;

    if-eqz p1, :cond_1

    .line 3
    sget-object p2, Le8/e$c;->s:Le8/e$c;

    iget-object v0, p0, Le8/e$b;->b:Ljava/lang/String;

    invoke-interface {p1, p2, v0}, Le8/e$d;->a(Le8/e$c;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method
