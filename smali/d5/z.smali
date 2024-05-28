.class public final synthetic Ld5/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg4/f;


# instance fields
.field public final synthetic a:Ld5/d;

.field public final synthetic b:Lg4/m;


# direct methods
.method public synthetic constructor <init>(Ld5/d;Lg4/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld5/z;->a:Ld5/d;

    iput-object p2, p0, Ld5/z;->b:Lg4/m;

    return-void
.end method


# virtual methods
.method public final a(Lg4/l;)V
    .locals 2

    iget-object v0, p0, Ld5/z;->a:Ld5/d;

    iget-object v1, p0, Ld5/z;->b:Lg4/m;

    invoke-virtual {v0, v1, p1}, Ld5/d;->u(Lg4/m;Lg4/l;)V

    return-void
.end method
