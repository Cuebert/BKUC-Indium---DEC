.class final Lz2/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/i$a;


# instance fields
.field final synthetic a:Lx2/l;


# direct methods
.method constructor <init>(Lx2/l;)V
    .locals 0

    iput-object p1, p0, Lz2/b0;->a:Lx2/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lx2/m;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lz2/b0;->a:Lx2/l;

    invoke-virtual {v0, p1}, Lx2/l;->b(Lx2/m;)V

    iget-object p1, p0, Lz2/b0;->a:Lx2/l;

    return-object p1
.end method
