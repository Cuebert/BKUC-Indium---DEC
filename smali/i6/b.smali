.class public interface abstract Li6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Landroidx/lifecycle/k;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/io/Closeable;",
        "Landroidx/lifecycle/k;"
    }
.end annotation


# virtual methods
.method public abstract N(Lk6/a;)Lg4/l;
    .param p1    # Lk6/a;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk6/a;",
            ")",
            "Lg4/l<",
            "Ljava/util/List<",
            "Li6/a;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract close()V
    .annotation runtime Landroidx/lifecycle/t;
        value = .enum Landroidx/lifecycle/f$b;->ON_DESTROY:Landroidx/lifecycle/f$b;
    .end annotation
.end method
