.class Ly8/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/b;->b(Ly8/b$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly8/b;


# direct methods
.method constructor <init>(Ly8/b;)V
    .locals 0

    iput-object p1, p0, Ly8/b$a;->a:Ly8/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Ly8/f;->b(Ljava/lang/String;)Ly8/f;

    move-result-object p1

    .line 2
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lb9/c;->s(Ly8/f;)V

    .line 3
    iget-object v0, p0, Ly8/b$a;->a:Ly8/b;

    invoke-static {v0, p1}, Ly8/b;->a(Ly8/b;Ly8/f;)V

    return-void
.end method
