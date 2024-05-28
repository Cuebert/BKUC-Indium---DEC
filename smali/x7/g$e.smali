.class Lx7/g$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx7/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation


# static fields
.field static final a:Lx7/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx7/g;

    invoke-direct {v0}, Lx7/g;-><init>()V

    sput-object v0, Lx7/g$e;->a:Lx7/g;

    return-void
.end method
