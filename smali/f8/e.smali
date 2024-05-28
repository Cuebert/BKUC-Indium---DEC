.class public final synthetic Lf8/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf8/h$o;


# instance fields
.field public final synthetic a:Lf8/h;

.field public final synthetic b:Lf8/b;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lf8/h;Lf8/b;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf8/e;->a:Lf8/h;

    iput-object p2, p0, Lf8/e;->b:Lf8/b;

    iput-boolean p3, p0, Lf8/e;->c:Z

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 3

    iget-object v0, p0, Lf8/e;->a:Lf8/h;

    iget-object v1, p0, Lf8/e;->b:Lf8/b;

    iget-boolean v2, p0, Lf8/e;->c:Z

    invoke-static {v0, v1, v2, p1}, Lf8/h;->d(Lf8/h;Lf8/b;ZLjava/util/List;)V

    return-void
.end method
